package BasicsProgram;

public class RevNo {
    public static void main(String[] args) {
        int no=1234;
        int rev=0;

        while(no!=0)
        {
            int last= no%10;     // 4       3         2        1
            rev=rev*10+last;    // 4       43        432      4321
            no /=10;             // 123     12        1        0
        }
        System.out.println(rev);
    }
}
