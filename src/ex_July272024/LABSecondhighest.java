package ex_July272024;

public class LABSecondhighest {
    public static void main(String[] args) {
        // Find the Secondhighest salary in the Arrays
        // Logic is first sort numbers in ascending order
        // then print the second number from array which is array index no 1

        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};


        for (int i = 0; i < salaries.length; i++) { // this loop is for salaries array
            for(int j=i+1; j<salaries.length; j++){ // this loop starts from 1 of salaries array
                if (salaries [i] < salaries[j]){ // this condition will start comparing numbers
                  int temp = salaries[i]; // if i value is less than j its value will be stored in temp
                    salaries [i] = salaries [j]; //
                    salaries[j] = temp;


                }

            }

        }
        System.out.println("sechondhighest " + salaries[1]);
    }
    }



