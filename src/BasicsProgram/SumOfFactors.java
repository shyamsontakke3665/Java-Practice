package BasicsProgram;

public class SumOfFactors {
    public static void main(String[] args) {
        int no=1000;
        int den=1;
        int sum=0;

        while(den <= no/2){
            if(no%den==0){
                sum += den;

            }
            den++;

        }
        System.out.println(sum+no);
    }

}
