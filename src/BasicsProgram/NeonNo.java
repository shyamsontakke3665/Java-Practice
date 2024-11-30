package BasicsProgram;

public class NeonNo {
    public static void main(String[] args) {
        int no=9;

        int sqr=no*no;
        int sum=0;
        while(sqr !=  0){
            int last = sqr%10;
            sum += last;
             sqr /=10;
        }
        if(sum==no)
            System.out.println("It is neon No");
        else
            System.out.println("It is not neon No");



    }
}
