package BasicsProgram;

import org.w3c.dom.ls.LSOutput;

public class FactorialNo {
    public static void main(String[] args) {
        int no=5;
        int fact=1;
        while(no != 0){
            fact= fact*no;
            no--;

        }
        System.out.println("Factorial is " +fact);
    }


}
