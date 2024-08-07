package ex_July282024;

public class LAB002_Building {
    public static void main(String[] args) {

        //  Class - Attribute / properties - data Types - primitive or non primitive.
        // Class - Behaviour /Methods - functions -

        // object - real entity - class -
        // ClassName classRef = new ClassName();

        // new ClassName(); - Object
        // classRef - Class Ref
        // ClassName = Class Name which blueprint you are using

        Building dlf = new Building();
        dlf.name = "DLF Pvt Builder";
        dlf.noOfRooms = 100;

        dlf.useLift();

        Building prestige = new Building();
        prestige.name = "Prestige Pvt Builder";
        prestige.noOfRooms = 100;

        prestige.useLift();

    }
}


