package ex_July132024;

public class LAB21_CharType2 {
    public static void main(String[] args) {

        byte b = 127;
        //  b = b+1; -> If added throws error as "java: incompatible types: possible lossy conversion from int to byte"
        System.out.println("Value of byte: " +b);
        char grade = 'A';
        System.out.println("grade: " +grade);
        char grade_Bhavani = 'E';
        System.out.println("grade Bhavani: " +grade_Bhavani);
        char grade_CS = 'B';
        System.out.println("grade_CS: " +grade_Bhavani);
        char c = '!';
        System.out.println("C: " +c);
        char c2 = '@';
        System.out.println("C2: " +c2);
        char _123 = 'N';
        System.out.println("_123: " +_123);

        // Can I change the data type of variable between program -> No
    }
}
