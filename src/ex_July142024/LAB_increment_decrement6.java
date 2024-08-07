package ex_July142024;

public class LAB_increment_decrement6 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        // ++a is 1 + 10 = 11 + 11+1 = 12 and 12+1
        System.out.println(a);
        // latest value of a is 13

    }
}
