package ex_July142024;

public class LAB_Concat {
    public static void main(String[] args) {
        int a=86;
        long b = 92;
        String s1 = "BB";
        String S2 = "CC";
        System.out.println(s1+S2+a+b);
        // output will be BBCC8692 as it is just concatination
        System.out.println(s1+S2+(a+b));
        // output will be BBCC178

    }
}
