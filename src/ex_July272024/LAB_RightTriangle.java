package ex_July272024;

public class LAB_RightTriangle {
    public static void main(String[] args) {
        /*Right Triangle Star Pattern
         *
         **
         ***
         ****
         *****   */
        int row = 6;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

                System.out.println();
            }

        }
    }

