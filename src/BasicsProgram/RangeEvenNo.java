package BasicsProgram;

public class RangeEvenNo {
    public static void main(String[] args) {
        int start=1;
        int end=100;

        while(start<= end)
        {
            if(start%2==0)
                System.out.println(start);
            start++;
        }
    }

}
