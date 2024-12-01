package Pattern;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the no");
    int no=sc.nextInt();

    int star=no/2;
    int space=0;

    for(int i=1; i<=no; i++){  // no= 9   1<=9 true   2<=9 true
        for(int j=1; j<=space; j++){   // 1<-0 false
                                       // 1<=1 true  2<=1 false
                                       // 1<=2 2<=2 true 3<=2 false
                                       // 1<=3 2<=3 3<=3 true 4<=3 false
                                       // 1<=2 2<=2 true 3<=2 false
            System.out.print("  ");
        }
        for(int j=1; j<=star; j++){  // 1<=4 2<=4 3<=4 4<=4 true 5<=4 false
                                     // 1<=3 2<=3 3<=3 true 4<=3 false
                                     // 1<=1 2<=2 true 3<=2 false
                                     // 1<=1 true 2<=1 false
                                     // 1<=2 2<=2 true 3<=2 false
            System.out.print("*   ");
        }

        if(i<=(no/2))  // 1<=4 true  2<=4 true   3<=4 true 4<=4 true 5<=4 false
        {
            space++;  // 0   1  2  3
            star--;  //  4   3  2  1
        }
        else{
            space--; // 2
            star++;  // 2
        }
        System.out.println();
    }
}
}
/*

*   *   *   *
- *   *   *
- - *   *
- - - *
- - *   *
*/
