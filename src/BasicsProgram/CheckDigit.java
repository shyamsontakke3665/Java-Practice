package BasicsProgram;

public class CheckDigit {
    public static void main(String[] args) {
        int no=123643;
        int digit=4;
        int count=0;

        while(no!=0){
            int last = no%10;
            if(last==digit) {
                count++;
                break;
            }
            no /=10;

        }
    }
}
