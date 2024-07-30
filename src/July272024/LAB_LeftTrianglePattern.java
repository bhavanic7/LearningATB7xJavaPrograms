package July272024;

public class LAB_LeftTrianglePattern {
    public static void main(String[] args) {
        int height = 5;  // You can change this value to adjust the height of the triangle

        printLeftAlignedTriangle(height);
    }
    public static void printLeftAlignedTriangle(int height) {
        for (int i = height; i <= height; i++) {
            for (int j = height; j <= i; j++) {System.out.print("*");
            {
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
}

