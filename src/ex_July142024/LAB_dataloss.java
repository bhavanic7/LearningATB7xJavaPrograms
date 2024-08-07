package ex_July142024;

public class LAB_dataloss {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
     //   int total = course+GST; // data will be lost in this case as int cannot store float - Implicit narrowing
        float total = course+GST; //explicit narrowing
        System.out.println(total);


    }
}