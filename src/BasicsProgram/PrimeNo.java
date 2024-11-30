package BasicsProgram;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no");
        int no=sc.nextInt();  //5

        int den=2;

        while(den < no){     //2<5 true     3<5 true  4<5 true    5<5
            if(no%den==0){   //5%2==1       5%3==2    5%4==1
                break;
            }
            den++;          // 3            4         5
        }

        if(no==den)      // 5==5  true
            System.out.println("it is prime no");
        else
            System.out.println("It is not Prime No");
    }
}
