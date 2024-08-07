package ex_July142024;

public class LAB_String8 {
    public static void main(String[] args) {
        String s1 = new String("pramod");
        String s2 = new String("pramod");
        String s3 = new String("pramod");
 // 3 are created yes because new is used

        System.out.println(s1 == s2); // Check for the ref and makes it false
        System.out.println(s2 == s3); // Check for the ref and makes it false
        System.out.println(s2.equals(s3)); // Check for the Content and makes it true

    }
}
