package Pattern;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no");
        int no=sc.nextInt();

        for(int i=no; i>0; i--){
             for(int j=1; j<no-i+1;j++)
             {
                 System.out.print(" "+" ");
             }

             for(int j=i*2; j>1; j-- )
             {
                 System.out.print("*"+" ");
             }


            System.out.println();
        }
    }
}
