import java.sql.SQLOutput;

public class LearnObject {
    public String studentName = "Sadiq";
    public static String gender = "female";
    public static int mobile = 999999;

    public static void main (String [] args){

        LearnObject LO =  new LearnObject();

        System.out.println (LO.studentName);
        System.out.println (LearnObject.gender);
        System.out.println ("studentName = " + LO.studentName);
        System.out.println ("gender = " + LearnObject.gender + ":|" + LearnObject.mobile);


    }

}
