package July202024;

import java.util.Scanner;

public class LAB_Printdetails {
    public static void main(String[] args) {
        // Write a program name, age, salary - print it
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s1.next();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter your age");
           int age = s2.nextInt();


        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter your salary");
        double   salary =  s3.nextDouble();

        System.out.println("your name "+ name);
        System.out.println("your age "+age);
        System.out.println("your salar "+salary);

        s1.close();
        s2.close();
        s3.close();


    }
}
