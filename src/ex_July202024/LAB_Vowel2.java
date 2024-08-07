package ex_July202024;

import java.util.Scanner;

public class LAB_Vowel2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you, If it is a vowel or not!");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch(user_input){
            case 'a','e','i', 'o', 'u':
                System.out.println("its a vowel");
                break;
            default:
                System.out.println("its a consonant");
        }
    }
}

