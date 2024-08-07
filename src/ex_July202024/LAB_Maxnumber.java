package ex_July202024;

import java.util.Scanner;

public class LAB_Maxnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt(); // it will store the enter number in line 6
       // System.out.println(Math.max(num1,num2));
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter num2");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Max number is " + num1);
        } else if (num2 > num1) {
            System.out.println("Max number is " + num2);
        } else {
            System.out.println("Equal");
        }
    }
}
