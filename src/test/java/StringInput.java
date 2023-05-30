import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("enter your name:");

         String input=object.next();     //enter string

        System.out.println("HI "  + input);

        System.out.println("enter 2nd person name:");
        String input2 = object.nextLine ();
        System.out.println("Hello " + input2);

        System.out.println("Do you have passport");
        String val = object.next();
        if (val.equals ("yes")){
            System.out.println("you can go abroad");
        }
        boolean flag = object.nextBoolean ();
        if (flag){
            System.out.println("you can go abroad");

        }
        else
            System.out.println("you can't go abroad, stay home");
    }
}
