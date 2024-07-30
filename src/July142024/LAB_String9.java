package July142024;

public class LAB_String9 {
    public static void main(String[] args) {
        String s1 = "Bhavani"; // stored in SCP
        //String s1 = "P r a m o d";
        //          |0|1|2|3|4|5|
        char c = s1.charAt(5);
        System.out.println(c);
        s1.concat("Prabhakar");
        System.out.println(s1);
        // answer will be only bhavani coz we are pointing to S1
        s1 = s1.concat(" Prabhakar");
        System.out.println(s1);
        // in this case answer will be Bhavani prabhakar as we are pointing to s1 and concat Prabhakar
    }
}
