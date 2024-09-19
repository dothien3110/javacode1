public class App0402{
    public static void main(String[] args) {
        Runnable r1 = new MyRunnable();       // tạo runnable
        Runnable r2 = new MyRunnable();

        Thread t1 = new Thread(r1);            // tạo thread liên kết với runnable
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
class MyRunnable implements Runnable{
    public void run(){              // Cài đặt phưong thức runnable
        int i =0;
        int tong=0;
        while(i<200){
            tong=tong+i;
            System.out.println(Thread.currentThread().getName()+":"+tong);
            i++;
        }
    }
}