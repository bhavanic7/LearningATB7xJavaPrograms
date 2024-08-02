package July272024;

public class LAB_String2 {
    public static void main(String[] args) {
        // Strings - imutable in nature, modifying will create a new one instead of existing one
        // StringBuilder , StringBuffer // mutable in nature, no new string will be created
        String s1 = "PRAMOD";
        s1 = "Dutta";

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        // change the value of string - Buffer
        stringBuffer.append("Dutta"); //PramodDutta
        stringBuffer.append("JI"); //PramodDutta
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");
        System.out.println(stringBuilder);

        //String Buffer - mutable in nature
        // Thread Safety? which means allotoing space for each string for a certain period of time
        // before modifying it (one by one)
        // because of one by one, string buffer is slow (Syncornized)

        // stringBuilder - mutable in nature
        // not thread safe not Syncornized and people mostly use string builder
    }
}
