import java.io.*;
public class Student implements java.io.Serializable{
    public String stu_Name;
    public String stu_Addr;
    public int stu_Id;
    public static void main(String[] args)  throws ClassNotFoundException {
        Student s = new  Student();
        s.stu_Name = "George";
        s.stu_Addr = "ABC, XYZ";
        s.stu_Id = 1;
        try {
            FileOutputStream fileout = new FileOutputStream("s.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(s);
            out.close();
            fileout.close();
            System.out.println("Object serializable and save in s.txt");
        } catch (IOException i) {
            i.printStackTrace();
        }
        try {
            ObjectInputStream dtdoc = null;
            dtdoc = new ObjectInputStream(new FileInputStream(
                "s.txt"));
            // read student
            Student s1 = (Student) dtdoc.readObject();
            // show student
            System.out.println(s1.stu_Name);
            System.out.println(s1.stu_Addr);
            System.out.println(s1.stu_Id);
            dtdoc.close();
            } catch (IOException  i){ i.printStackTrace(); }
    }

}
