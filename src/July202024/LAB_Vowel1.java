package July202024;

import java.util.Scanner;

public class LAB_Vowel1 {
    public static void main(String[] args) {
        // Take a user input as char and Tell the user if it is a vowel
        // aeiou
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you, If it is a vowel or not!");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch (user_input) {
            case 'a':
                System.out.println("is a Vowel");
                break;
            case 'e':
                System.out.println("is a Vowel");
                break;
            case 'i':
                System.out.println("is a Vowel");
                break;
            case 'o':
                System.out.println("is a Vowel");
                break;
            case 'u':
                System.out.println("is a Vowel");
                break;
            default:
                System.out.println("This is not vowel");


        }
    }
}