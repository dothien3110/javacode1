import java.util.Scanner;
public class bai01{
    public static void main(String[]args){
        int n;
        System.out.println("nhap n la  so tu nhien :");
        try(Scanner aScanner = new  Scanner(System.in)){
            n=aScanner.nextInt();
        }
        int  tonguoc=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                tonguoc+=i;
            }
        }
        if(tonguoc==n){
                System.out.println("n la so happy");
            }
        else{
                System.out.println("n khong la so happy");
            }
        
    }
}