package ex_July202024;

public class LAB_Switch5 {
    public static void main(String[] args) {
        // JDK > 13 multiple switch are supported
        // JDK > 13 no need to add break instead use -> as below

        int itemCode = 002;

        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }

    }

}

