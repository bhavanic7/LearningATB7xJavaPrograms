package ex_July212024;

public class LAB21_dowhile2 {
    public static void main(String[] args) {
        int i = 10;
//        while (i<10){     // it will not go further as condition is false
//            System.out.println(i);
//            i++;
//        }

        do{  // do loop runs atleast once and then condition fails
            System.out.println(i);
            i++;
        }while(i<10);


    }
}
