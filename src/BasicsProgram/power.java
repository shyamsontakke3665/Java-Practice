package BasicsProgram;

public class power {
    public static void main(String[] args) {
        int raise=3;
        int base=1;
        int pow=1;

        for(int i=1; i<=raise; i++){
            pow *=base;
        }
        System.out.println(pow);
    }

}
