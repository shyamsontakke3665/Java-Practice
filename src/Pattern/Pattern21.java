package Pattern;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int no = sc.nextInt();

        for(int i=1; i<=no; i++){
            for(int j=1 ; j<i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=no-i; j++){
                if(i==1 || j==1|| j==no-i)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    }
