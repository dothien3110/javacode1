public class App0403 extends Thread {
    public static void main(String[] args) {
        MyThread[] T = new MyThread[3];
        for(int i=0;i<T.length;i++){
            T[i]=new MyThread();
            T[i].start();
        }
    }
}
class myMythread extends Thread{
    public static int x= 5;
    public static boolean stop = false;

    public static synchronized void Trans(){
        if(x>0){
            try{
                sleep(100);
            }catch(Exception E){
                return;
            }x--;
        }
    }
    public void run(){
        do{
            Trans();
            System.out.println("x = "+x);
        }while(x>0);
    }
}
