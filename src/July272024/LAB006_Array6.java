package July272024;

public class LAB006_Array6 {
    public static void main(String[] args) {
        int[] a = new int[4]; // this is not adding values but created array from 0,1,2,3
        a[3] = 90; // Always use square bracket mention its length to add values
        System.out.println(a[2]); // you need to mention array name and index number to print its values
        System.out.println(a[3]);
        System.out.println(a[0]);
    }
}
