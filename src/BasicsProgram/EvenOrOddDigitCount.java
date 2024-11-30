package BasicsProgram;

public class EvenOrOddDigitCount {
    public static void main(String[] args) {
        int no=4435345;
        int evenCount=0;
        int oddCount=0;
        while(no !=0){
             int last= no%10;
             if(last%2==0)
                 evenCount++;
             else
                 oddCount++;

             no /= 10;

        }
        System.out.println("Even Count is " +evenCount);
        System.out.println("Odd Count is "+ oddCount);
    }
}
