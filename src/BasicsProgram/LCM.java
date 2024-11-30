package BasicsProgram;

public class LCM {
    public static void main(String[] args) {
        int no1=7 , no2=11;

        int large= no1 > no2 ? no1 : no2 ;  //

        int i=1;

        while(true){
            if(large*i%no1==0 && large*i%no2==0){
                System.out.println(large*i);

                if(large*i >= 1000)
                    break;
            }
            i++;
        }
    }


}
