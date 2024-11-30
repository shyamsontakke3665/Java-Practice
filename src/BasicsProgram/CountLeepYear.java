package BasicsProgram;

import java.util.Scanner;

public class CountLeepYear {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the Start year");
            int start=sc.nextInt();
            System.out.println("Enter the end year");
            int end=sc.nextInt();
            int count =0;

            while(start <=end) {
                if (start % 4 == 0 && start % 100 != 0 || start % 400 == 0) {
                     count++;
                }
                start++;
            }
            System.out.println(count);

    }

}
