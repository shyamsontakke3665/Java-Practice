package BasicsProgram;

public class ExtractDigit {
    public static void main(String[] args) {
        int no=1234;

        while(no != 0){
            int last = no % 10;
            System.out.println(last);
            no /=10;
        }
    }
}
