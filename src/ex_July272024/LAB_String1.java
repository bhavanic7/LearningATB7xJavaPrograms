package ex_July272024;

public class LAB_String1 {
    public static void main(String[] args) {
        // String - Bunch of Chars.
        //
        String s1 = new String("pramod"); // Heap Area
        String s2 = "pramod"; // String constant pool

        // String - Immutable in nature. once you modify, it will rewirte the new one and not modify existing
        System.out.println(s1.length());
        System.out.println(s1.indexOf("p"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());

    }
}
