package ex_July212024;

public class LAB16_For16 {
    public static void main(String[] args) {

        for(int i=0; i<=50; i++){
            if (i%2==0) {
                System.out.println("even " + i);
                continue;  // instead of else condition it will continue to print odd numbers
                // continue will print line 12 when if condition is not matching
            }
            System.out.println("odd " + i);
            }
        }
    }
