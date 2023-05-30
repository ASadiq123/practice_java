import java.util.Scanner;

public class FruitScanner {
    public static void main (String [] args ){
        Scanner object = new Scanner (System.in);

        System.out.println("what are you eating?");
        String fruitName = object.next();
        System.out.println ("how many " + fruitName + " are you eating?" );
        int numFruit = object.nextInt();
        System.out.println( numFruit + " " + fruitName);


        System.out.println ("what am I eating?");
        String fruitName1 = object.next();
        System.out.println("what is he eating" );




    }

}
