package July202024;

import java.util.Scanner;

public class LAB_FizzBuzz {
    public static void main(String[] args) {
      /* Write a program that prints numbers from 1 to 100.
 multiples of 3, print "Fizz" and for multiples of 5, print "Buzz."
 For numbers that are multiples of both 3 and 5, print "FizzBuzz." */
// Logic: For Loop 1-100, if n%3=0 Fizz ; n%5=0 Buzz n%3 == 0 & n%5==0 -> Fizzbuzz


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int limit=100;

        for (int i=1; i<=limit; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Number is fizz buzz");
            } else if ( i % 3 == 0) {

                System.out.println("Number is fizz");
            } else if (i % 5 == 0) {
                System.out.println("Number is buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}