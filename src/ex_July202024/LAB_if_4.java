package ex_July202024;

public class LAB_if_4 {
    public static void main(String[] args) {
        boolean a = true; // no relation with if condition
        a = !a;
        if (2 + 2 <= 4) { // this step will be executed
            System.out.println("Inside the loop");
        } else {
            System.out.println("Outside -> " + a);
            // Understand with debug -> checking the code line by line
        }
    }
}