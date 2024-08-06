package July282024;

public class Animal {
     String Animal_name;
     int Animal_age;
     String Animal_Type;

     //We can have both class and main in the same program

    public static void main(String[] args) {

        Animal A1 = new Animal();
        {
            A1.Animal_name = "Deer";
            A1.Animal_age = 5;
            A1.Animal_Type = "Wild";
            System.out.println(A1.Animal_name+ "\n" + A1.Animal_age+"\n"+A1.Animal_Type);

        }

        Animal A2 = new Animal();
        A2.Animal_name = "Dog";
        A2.Animal_age = 2;
        A2.Animal_Type = "Pet";
        System.out.println(A2.Animal_name +"\n"+ A2.Animal_age +"\n"+A2.Animal_Type);


    }
}
