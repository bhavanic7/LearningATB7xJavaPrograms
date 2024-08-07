package ex_July202024;

public class LAB_Switch4 {
    public static void main(String[] args) {

        // JDK > 13 we can use multiple switch

        int itemcode = 001;
        switch (itemcode) {
            case 001, 002, 003:
                System.out.println("It is Electronic Gadget!");
                break;
            case 004, 005, 007:
                System.out.println("It is Mechinal Gadget!");
                break;
            default:
                System.out.println("None");

        }
    }
}
