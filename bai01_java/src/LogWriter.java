import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Calendar;
public class LogWriter extends Thread {
    private String filename;
    private long time;

    public LogWriter(String name, String filename, long time){
        super(name);
        this.filename = filename;
        this.time=time;
    }
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Writer wr = new BufferedWriter(new FileWriter(filename,true));
                this.sleep(time);
                wr.append(getName()+ "[" + Calendar.getInstance().getTime() +"]: Log-" + i + "\r\n");
                wr.close();
            }catch(Exception e){
                System.out.println(e.getStackTrace());
            }
        }
    }
    public static void main(String[] args) {
        LogWriter lw1 = new LogWriter("thread1", "log.txt",3000);
        LogWriter lw2 = new LogWriter("thread2", "log.txt", 4000);
        lw1.start();
        lw2.start();
    }
}

