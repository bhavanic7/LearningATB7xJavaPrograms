package July202024;

import java.util.Scanner;

public class LAB_PositiveNegative {
    public static void main(String[] args) {
        // Program to Check
        // if a Number is Positive
        // , Negative,
        // or Zero.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("Positive");
        } else if (a < 0)
            {
                System.out.println("negative");
            }
        else{
                System.out.println("Zero");


            }
        }
    }

