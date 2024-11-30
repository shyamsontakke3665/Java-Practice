package BasicsProgram;

public class PalindromNo {
    public static void main(String[] args) {
        int no=34543, temp=no;
        int rev=0;
        while(temp != 0){
            int last = temp%10;
            rev= rev*10+last;
            temp /=10;
        }
        if(no==rev)
            System.out.println("it is Palindrom No  ");
        else
            System.out.println("it is not Palindrom no");
    }
}
