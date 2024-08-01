package July212024;

public class LAB26_LeftTriangle {
    public static void main(String[] args) {
        /*Left Triangle Star Pattern
        */
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" "); // Print space without newline
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); //print stars
            }

            System.out.println();
   ;     }

    }
}

