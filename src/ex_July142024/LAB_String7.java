package ex_July142024;

public class LAB_String7 {
    public static void main(String[] args) {
        {
            String name = "The Testing Academy"; // SCP
            String name1 = "The Testing Academy"; // SCP memory, only one value will be present

            String name2 = new String("The Testing Academy"); // Heap area (OA)

//        System.out.println(name == name1); // Check for the Ref in SCP only
//        System.out.println(name.equals(name1)); // Check for the Content and matches


            System.out.println(name1 == name2);
            // Check for the Ref but it will be false as it is stored in different memory, heap and SCP
            System.out.println(name1.equals(name2));
            // Check for the Content and makes it true as content is matching

        }
    }
}