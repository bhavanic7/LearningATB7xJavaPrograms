package July212024;

public class LAB14_For13 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                continue; // this will skip the below print, when condition is matching
            }
            System.out.println("After!!");
        }
    }
}