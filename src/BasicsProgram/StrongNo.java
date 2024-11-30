package BasicsProgram;

import java.util.Scanner;

public class StrongNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entet the no");
        int no=sc.nextInt();
        int sum=0, temp=no;

        while(no != 0){          // 145 != 0 true   // 14 !=0 true  // 1!=0 true 0!=0
            int last = no%10;    // 145%10 =5       // 14%10=4      // 1%10=1

            int fact=1;

            while(last > 0){ //5>0 true  4>0 true   3>0 true  2>0 true   1>0 true   0>0false // 4>0 true  3>0 true  2>0true  1>0 true 0>0 false
                fact *=last; //1*5=5     5*4=20     20*3=60   60*2=120   120*1=120           // 1*4=4     4*3=12    12*2=24  24*1=24
                last--;      // 4        3          2         1          0                   // 3         2         1        0
            }
             sum +=fact;    // 0+120=120    //  120+24=144  //144+1=145
             no /=10;       // 145/10=14    //  14/10=1     // 1/10=0

        }

        if(temp==sum)
            System.out.println("It is Strong no");
        else
            System.out.println("It is not Strong no");
    }
}
