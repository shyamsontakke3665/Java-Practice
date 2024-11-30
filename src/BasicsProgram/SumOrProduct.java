package BasicsProgram;

public class SumOrProduct {
    public static void main(String[] args) {
        int no= 123;
        int sum=0;
        int product=1;

         while(no != 0){
             int last = no%10;
             sum += last;
             product *= last;

             no /=10;

         }
         if(sum==product)
             System.out.println("Sum = "+sum+" or Product= "+product+" are Equal ");
         else
             System.out.println("Sum = "+sum+" or Product= "+product+" are Not Equal ");
    }
}
