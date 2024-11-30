package BasicsProgram;

public class SwapNo {
    public static void main(String[] args) {
        int no1=19;
        int no2=89;
        int no3;

        System.out.println("Before Swap is no1 = "+no1+ " and no2= "+no2 );

        no3=no1;
        no1=no2;
        no2=no3;

        System.out.println("After Swap is no1 = "+no1+ " and no2= "+no2 );
    }
}
