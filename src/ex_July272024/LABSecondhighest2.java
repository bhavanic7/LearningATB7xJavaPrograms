package ex_July272024;

import java.util.Scanner;

public class LABSecondhighest2 {
    public static void main(String[] args) {
        int number[] = new int[8]; // creating array of int data type of length 8
        Scanner sc = new Scanner(System.in);  // user input
        for (int i = 0; i < number.length; i++) { // i is pointing to 0 and then increases, this is loop is for array
            System.out.println("Enter the numbers");
            number[i] = sc.nextInt(); // stores the user input value in the i pointing place

            for (int j = 0;j < number.length; j++) { // this loop is for  array
                for (int k = j + 1; k < number.length; k++) { // this loop starts from 1 of number array
                    if (number[j] < number[k]) { // this condition will start comparing numbers
                        int temp = number[j]; // if j value is less than k its value will be stored in temp
                        number[j] = number[k]; // now j is empty, k value will go to j
                        number[j] = temp; // now temp value will go to k


                    }
                }
            }

        }
        System.out.println("sechondhighest " + number[1]);
    }
}