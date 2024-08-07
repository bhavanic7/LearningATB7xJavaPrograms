package ex_July142024;

public class LAB_long {
    public static void main(String[] args) {

            long phone_no = 9876543210L;
            // short s = phone_no; // Implicit Narrowing - JVM?
            short sh = (short) phone_no;
            System.out.println(sh);
            // JVM - GC -

        }
    }


