package BasicsProgram;

public class SumOfDigit {
    public static void main(String[] args) {
         int no=12345;

         int sum=0;

         for(int i=0; i<no; no/=10){
             int last = no%10;
             sum +=last;
         }
        System.out.println(sum);
    }
}
