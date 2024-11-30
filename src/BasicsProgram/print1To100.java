package BasicsProgram;

public class print1To100 {
    public static void main(String[] args) {
        int start =1;
        int end =100;
        int count=0;
        while(start <= end){
            System.out.print(start+" ");
            start++;
            count++;

            if(count==10){
                System.out.println();
                count=0;
            }
        }
    }
}
