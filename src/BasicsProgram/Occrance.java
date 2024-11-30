package BasicsProgram;

public class Occrance {
    public static void main(String[] args) {
        int no=3454446;
        int digit=4;
        int count=0;

        for(int i=0; i < no; no/=10 ){
            int last =no%10;
            if(last==digit)
                count++;
        }
        System.out.println("Count is "+count);
    }
}
