package BasicsProgram;

public class fabonacciSeries {
    public static void main(String[] args) {
        int no=10;
        int no1=0; int no2=1; int no3;

        for(int i=1; i<=no; i++){
            no3=no1+no2;
            System.out.print(no1+" ");
            no1=no2;
            no2=no3;
        }
    }

}
