package ex_July202024;

import java.util.Scanner;

public class LAB_Userinput {
    public static void main(String[] args) {
        // Logic Building - Ready
        // 1. Figure out the inputs &  // 2. Data type
        //  Data type  - . int
        // How to take input in the Java? - Scanner - class -
        // nextInt() -> input
        // 3. Do we need conversion or direclty
        // 4. Rough logic - num%2==0 even,odd
        // 5. optimize

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println("the value is "  +a);

        if(a%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

    }
}



