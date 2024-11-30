package BasicsProgram;

public class SwapWithoutThirdVar {
    public static void main(String[] args) {
        int no1=10;
        int no2=20;


        System.out.println("Before Swap is no1 = "+no1+ " and no2= "+no2 );

         no1=no1+no2;    // 10+20=30;
         no2=no1-no2;    // 30-20=10;
         no1=no1-no2;    // 30-10=20

        System.out.println("After Swap is no1 = "+no1+ " and no2= "+no2 );
    }
}
