package BasicsProgram;

public class Tables1To10 {
    public static void main(String[] args) {
        int start=1;
        int end=10;

        while(start <=10){
            for(int i=1; i<=end; i++){
                int tables =start*i;
                System.out.print(tables+"\t");
            }
            System.out.println();
            start++;
        }
    }

}
