package July202024;

public class LAB_if_5 {
    public static void main(String[] args) {
        // Modulus - %
        // 10%2 -> 0
        // 11%2 -> 1
//        2 | 11 | 5 - Q
//            10
//           -----
//            1 - R

        int num = 11;
        if(num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
