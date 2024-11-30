package BasicsProgram;

import java.util.Scanner;

public class ATMPin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int stored=4567;
        int attempt=1;

        do{
            System.out.println("Enter the pin");
            int pin=sc.nextInt();

            if(stored==pin){
                System.out.println(" SuccessFully login ");
                break;
            }
            else{
                System.out.println("Invlid Pin");
                attempt++;
            }

        } while(attempt <=3);

            if(attempt > 3)
                System.out.println("You enterd Three times wrong password you try after 24 hours ");
    }

}
