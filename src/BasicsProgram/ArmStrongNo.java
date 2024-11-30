package BasicsProgram;

public class ArmStrongNo {
    public static void main(String[] args) {
        System.out.println(isArmStrongNo(153));
    }

    public static boolean isArmStrongNo(int num){
         int ct=count(num);
         int sum=0;

         for(int i=num; i!=0; i/=10){
             int last = i%10;
             sum=sum+power(last,ct);
         }
         return sum==num;
    }


    public static int power(int base , int raise){
        int pow=1;

        for(int i=0; i<raise; i++){
            pow *=base;
        }
        return pow;
    }

    public static int count (int num)    {
         int count=0;
        while(num!=0) {
            num /= 10;
            count ++;
        }
        return count;
    }
}
