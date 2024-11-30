package BasicsProgram;

public class SumOfEvenOddDigit {
    public static void main(String[] args) {
        int no =2455325;

        int evenSum=0, oddSum=0;

        for(int i=0; i!=no; no/=10) {
            int last = no % 10;

            if (last % 2 == 0) {
                evenSum += last;
            } else {
                oddSum += last;
            }

        }
        System.out.println("Even Digit Sum is  : "+evenSum);
        System.out.println("Odd Digit Sum is  : "+oddSum);
    }
}
