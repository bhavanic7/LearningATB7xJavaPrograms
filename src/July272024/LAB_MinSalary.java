package July272024;

public class LAB_MinSalary {
    public static void main(String[] args) {
        {
            int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
            int min = salaries[0];
            for (int i = 0; i < salaries.length; i++) {

                if (min > salaries[i]) {
                    min = salaries[i];
                }
            }

            System.out.println(min);

        }
    }
}



            // Sort -> find the last one -
//        Arrays.sort(salaries);
//        System.out.println(salaries[salaries.length-1]);





