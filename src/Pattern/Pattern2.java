package Pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no");
        int no=sc.nextInt();

        for(int i=0; i<no; i++){
            for( int j=0; j<no; j++){
                if( i==0 || j==0|| j==no-1 || i==no-1){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
