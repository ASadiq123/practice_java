import java.util.Scanner;

public class CharInput {

    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        System.out.println( "enter any char");
         char val = sc.next().charAt(0);
        System.out.println( "enter by user " + val);

    }



}
