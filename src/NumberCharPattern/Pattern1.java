package NumberCharPattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no");
            int no = sc.nextInt();

            for(int i=1; i<=no; i++){
                for(int j=1; j<=no; j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
    }
}

