package July132024;

public class LAB24_Concat {
    public static void main(String[] args) {
        /* Concatenate: forms a new String that is the combination of multiple strings
  using + operator OR Concat() Method */
//   Simple Concat
        String s = "Yashi" + "Risi";
        System.out.println(s);// Yashi Rishi
//  + used as Addition
        int a = 10;
        int b = 34;
        int c = a + b;
        System.out.println(c);
        System.out.println(a+b+c);
        System.out.println("total is "  + c);

        String s1 = "Bhavani";
        String s2 = "Prabhakar";
        System.out.println("s1=soumya+s2=Navaneeth,s1+s2 is: " +s1+s2); //'+' Concatenates 2 strings/chars
        System.out.println("\n");
        String s3 = "Yashi";
        int x = 50;
        int y = 100;
        System.out.println("x=50,y=100,s3=Yashi\n");
        System.out.print("x+y+s3: ");
        System.out.println(x+y+s3); // adds x+y
        //       System.out.println("x+y+s3: " + x+y+s3); // considers x+y as string
        System.out.print("s3+x+y: ");
        System.out.println(s3+x+y);
        System.out.print("x+s3+y: ");
        System.out.println(x+s3+y);
        System.out.print("x+y+s3+y+s3+x+y: ");
        System.out.println(x+y+s3+y+s3+x+y);
    }
}