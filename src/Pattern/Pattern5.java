package Pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int no = sc.nextInt();

        for (int i = 0; i < no; i++) {
            for (int j = 0; j < no; j++) {
                if (i==no/2 || j==no/2 || i==0 && j>no/2  || j==0 && i<no/2 || i==no-1 && j<no/2 || j==no-1 && i>no/2)
                    System.out.print("*" + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
