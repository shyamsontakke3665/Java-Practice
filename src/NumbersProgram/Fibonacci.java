package NumbersProgram;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        fiboSeries(10);
        System.out.println("5 th fibo no is "+nthFiboNo(+5));
        System.out.println(isFibo(13));
    }
    // fibonacci Series
    public static void fiboSeries(int n){
        int n1=0, n2=1, n3=0;
        for(int i=1; i<=n; i++){
            System.out.println(n1);
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }

    public static boolean isFibo(int no){

    }

    // nth fibo no
    public static int  nthFiboNo(int n){
        int n1=0, n2=1, n3=0;
        for(int i=1; i<=n; i++){
            n3=n1+n2;
            if(i!=n){
                n1=n2;
                n2=n3;
            }
        }
        return n1;

    }

}
