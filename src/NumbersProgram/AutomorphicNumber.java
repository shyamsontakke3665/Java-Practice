
//the no which is after squar last digit is equals to number
// 6 is no after sqr 36 last digti is 6=6 is autpmorphicno.
// 25 = 625
package NumbersProgram;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        System.out.println("No " +" sqr");
        // print the range of automorphic no;
        for(int i=1; i<=1000; i++){
            if(automorphic(i)){
                System.out.println(i+"  "+(i*i));
            }
        }

    }
    // return the no is automorphic or not.
    public static boolean automorphic(int no){
        int ct=count(no);
        int sqr=no*no;

        return sqr%power(10,ct)==no;
    }
    //calculate power
    public static int power(int base, int raise){
        int pow=1;
        for(int i=0; i<raise; i++){
            pow *=base;
        }
        return pow;
    }
    // count the no digit
    public static int count(int no){
        int ct=0;
        while(no!=0){
            no/=10;
            ct++;
        }
        return ct;
    }

}
