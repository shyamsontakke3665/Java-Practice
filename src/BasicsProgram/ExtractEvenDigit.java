package BasicsProgram;

public class ExtractEvenDigit {
    public static void main(String[] args) {
        int no=12345;

        while(no != 0){
            int last = no % 10;

            if(no%2==0)
                System.out.println(last);

            no /= 10;

        }
    }
}
