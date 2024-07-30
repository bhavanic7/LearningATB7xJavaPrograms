package July202024;

import java.util.Scanner;

public class LAB_findLargestnumber {
    public static void main(String[] args) {
        //Program to Find the Largest Among Three Numbers:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int a = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter number2");
        int b = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter number3");
        int c = sc2.nextInt();

        if (a>=b && a>=c){
            System.out.println("greater number is " + a);
        }
        else if (b>=a && b>=c){
            System.out.println("greater number is " + b);
        }
        else{
            System.out.println("greater number is " + c);
        }

    }
}
