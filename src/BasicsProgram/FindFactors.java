package BasicsProgram;

public class FindFactors {
    public static void main(String[] args) {
        int no=100;
        int den=1;

        while(den <= no/2 ){
            if(no%den==0){
                System.out.println(den);
            }
            den++;
        }
        System.out.println(no);
    }

}
