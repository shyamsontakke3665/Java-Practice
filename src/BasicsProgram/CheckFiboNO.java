package BasicsProgram;

public class CheckFiboNO {
    public static void main(String[] args) {
        int no=34;

        int no1=0;
        int no2=1;
        int no3;

        while(true){
            no3=no1+no2;

            if(no1==no){
                System.out.println("it is fiboo no");
                break;
            }
            else if(no1 <= no2){
                no1=no2;
                no2=no3;
            }
            else {
                System.out.println("it is not fiboo no");
                break;
            }
        }
    }
}
