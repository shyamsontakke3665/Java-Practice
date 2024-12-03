package Pattern;

public class Pattern23 {
    public static void main(String[] args) {
        int no=7;
         int count= 10;
//         char  ch='A';


        for(int i=1; i<=no; i++){

            for(int j=1; j<i; j++){
                System.out.print("   ");
                count++;
            }
            char ch='A';
            for(int j=1; j<=no-i+1; j++){
                count++;

                if(i%2!=0) {
                    System.out.print(count+" ");
                }
                else{

                    System.out.print(ch+ "  ");
                    ch++;
                }

            }
            System.out.println();


            }



        }
    }

