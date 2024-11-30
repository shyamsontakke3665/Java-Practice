package BasicsProgram;

public class HCF {
    public static void main(String[] args) {
            int no1=10 , no2=20;

            int small= no1 < no2 ? no1 : no2 ;



            while(small !=0){
                if( no1%small==0 && no2%small==0){
                    System.out.println(small);


                }
                small--;
            }
    }




}
