import java.util.Scanner;

public class AdditionofTwoNumber {
    public static void main(String[] args) {
        System.out.println("Enter 1 num :");
        Scanner object = new Scanner (System.in);
        int num1 = object.nextInt (); // entering number
        System.out.println ("the number which entered by user " + num1);

        System.out.println("Enter 2nd number:");
        int num2 = object.nextInt (); // entering number
        System.out.println ("the number which entered by user " + num2);

        System.out.println("  sum of both number:  "  + (num1+num2));
        System.out.println( "multiplication of two number:  "  + (num1*num2));
        int num3 = object.nextInt();
        System.out.println ("the number which entered by user " + num3);
   }
}