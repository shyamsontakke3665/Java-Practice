package BasicsProgram;

public class CountEvenOddFactors {
    public static void main(String[] args) {
        int no=100;
        int den=1, evenCount=0, oddCount=0;

        while(den <= no){
            if(no%den==0){
                if(den%2==0){
                    evenCount++;
                }
                else
                    oddCount++;
            }
            den++;
       }
        System.out.println("Even Count is " +evenCount);
        System.out.println("Odd Count is " +oddCount);


    }
}
