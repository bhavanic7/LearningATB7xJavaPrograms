package July282024;

public class LAB004_Bank {
    public static void main(String[] args) {

        Bank B1 = new Bank();
        Bank B2 = new Bank();

        B1.name = "SBI";
        B1.balance = 1000000;
        System.out.println(B1.name+"\n"+B1.balance);

        B2.name = "HDFC";
        B2.balance = 100000000;
        System.out.println(B2.name+"\n"+B2.balance);
        // System is a PrintStream
        // PrintStream has out variable
        // and out variable has println function in java through which we are printing
    }
}
