package Pattern;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int no = sc.nextInt();

        for( int i=1; i<=no; i++){
            for(int j=1; j<=no-i; j++){
                System.out.print("  ");
            }

            for(int j=1; j<=i*2-1; j++){
                if(j==1 || i==no || j==i+i-1 )
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


