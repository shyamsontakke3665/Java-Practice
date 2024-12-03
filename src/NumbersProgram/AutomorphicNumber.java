package NumbersProgram;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        for(int i=1; i<=1000; i++){
            if(automorphic(i)){
                System.out.print(i+" ");
            }
        }

    }

    public static boolean automorphic(int no){
        int ct=count(no);
        int sqr=no*no;

        return sqr%power(10,ct)==no;
    }

    public static int power(int base, int raise){
        int pow=1;
        for(int i=0; i<raise; i++){
            pow *=base;
        }
        return pow;
    }

    public static int count(int no){
        int ct=0;
        while(no!=0){
            no/=10;
            ct++;
        }
        return ct;
    }

}
