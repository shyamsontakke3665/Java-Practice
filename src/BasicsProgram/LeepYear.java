package BasicsProgram;

import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year");

        int year=sc.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("It is leep year");
        }
        else{
            System.out.println("It is not leep year");
        }
    }
}
