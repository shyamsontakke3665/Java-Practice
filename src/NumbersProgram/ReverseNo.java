package NumbersProgram;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no....");
        int no=sc.nextInt();
        System.out.println(rev(no));
    }

    public static int rev(int no){
       int rem=0;
        while(no!=0){
            int last=no%10;
            rem=rem*10+last;
            no /= 10;
        }

        return rem;
    }
}

