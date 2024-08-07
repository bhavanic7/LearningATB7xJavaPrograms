package ex_July212024;

import java.util.Scanner;

public class LAB_Leapyear {
    public static void main(String[] args) {
        //  To check if the input year is leap year or not
//  Logic: if n%4=0, then leap year else not leap year
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("its a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}


