// the no is after rev also same as no is called palindrome no;
// like 212 is palindrome no
package NumbersProgram;

public class PalindromeNo {
    //range of palindromno
    public static void main(String[] args) {
        for(int i=1; i<=1000; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
    // next palindrome no
    public static  int nextPalindrome(int no){
        int num=no+1;
        while(true){
            if(isPalindrome(num)){
                  return num;
             }
             else {
                 num++;
             }
         }
    }
    // check isPalindrom or no
    public static boolean isPalindrome(int no){
        return rev(no)==no;
    }
    // it is used to rev no
    public static int rev(int no){
        int rev=0;
        while(no!=0){
            int last=no%10;
            rev=rev*10+last;
            no /=10;
        }
        return rev;
    }
}
