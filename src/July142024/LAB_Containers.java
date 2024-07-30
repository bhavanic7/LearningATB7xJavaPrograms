package July142024;

public class LAB_Containers {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 23;
        int c = a + b; // byte + byte should be in an int, wheather it is char or anything,
        System.out.println(c);

        char a1 = 'A'; // this is ASCII value - refer notes 65
        char b1 = 'B';  // this is ASCII value - refer notes 66
        int c1 = a1 + b1; // AB ->char
        System.out.println(c1); //(65+66)
        System.out.println('A' == 65);
        System.out.println('B' == 69);
    }
}