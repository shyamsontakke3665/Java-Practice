package BasicsProgram;

import java.util.Scanner;

public class LeepYearInRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the Start year");
        int start=sc.nextInt();
        System.out.println("Enter the end year");
        int end=sc.nextInt();

        while(start <=end) {
            if (start % 4 == 0 && start % 100 != 0 || start % 400 == 0) {
                System.out.println(start);
            }
            start++;
        }
    }
}
