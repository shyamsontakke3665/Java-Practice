package BasicsProgram;

public class FindCount {
    public static void main(String[] args) {
        int no=3445663;
        int count=0;
        while(no!=0){
            no /= 10;
            count++;
        }
        System.out.println(count);
    }
}
