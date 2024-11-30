package NumberCharPattern;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int no = sc.nextInt();

        // pattern1(no);
        // pattern2(no);
        // pattern3(no);
        // pattern4(no);
         pattern5(no);
    }

    // Pattern 1
    public static void pattern1(int no) {
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= no; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Pattern 2
    public static void pattern2(int no) {
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= no; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Pattern 3
    public static void pattern3(int no) {
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Pattern 4
    public static void pattern4(int no) {
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Pattern 5
    public static void pattern5(int no) {
        int count=1;
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }





}
