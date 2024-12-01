package Pattern;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no");
        int no=sc.nextInt();

        int star=1;
        int space=no/2;

        for(int i=1; i<=no; i++){
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("* ");
            }

            if(i <= no/2){
                star++;
                space--;
            }
            else{
                star--;
                space++;
            }
            System.out.println();
        }
    }
}
