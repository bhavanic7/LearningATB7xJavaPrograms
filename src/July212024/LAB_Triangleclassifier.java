package July212024;

import java.util.Scanner;

public class LAB_Triangleclassifier {
    public static void main(String[] args) {
        // Write a program that classifies a triangle based on its side lengths
        // .// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->
    Scanner a1 = new Scanner(System.in);
        System.out.println("Enter number");
        int S1 = a1.nextInt();
    Scanner a2 = new Scanner(System.in);
        System.out.println("Enter number");
        int S2 = a1.nextInt();
    Scanner a3 = new Scanner(System.in);{
            System.out.println("Enter number");
            int S3 = a1.nextInt();

            if (S1 == S2 && S2 == S3 && S3 == S1 )
            System.out.println("The triangle is equilateral");
            else if (S1 == S2 || S2 == S3 || S3 == S1 )
                System.out.println("The triangle is isosceles ");
            else if (S1 != S2 && S2 != S3 && S3 == S1 );
            System.out.println("The triangle is scalene ");

        }

    }
}
