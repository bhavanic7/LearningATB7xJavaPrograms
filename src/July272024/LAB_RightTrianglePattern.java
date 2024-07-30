package July272024;

public class LAB_RightTrianglePattern   {
    public static void main(String[] args) {
        int height = 7;  // You can change this value to adjust the height of the triangle

        printRightAlignedTriangle(height);
    }

    public static void printRightAlignedTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            // Print leading spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}

