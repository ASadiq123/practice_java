import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class FruitScanner1 {

    public static void eat (){
        System.out.println("NO one is having any fruit");
    }

    public static void eat (String fruitName, int numOfFruit){
        System.out.println( "I am eating " + numOfFruit + fruitName);
    }

    public static void eat (float priceOfFruit, String fruitName){
        System.out.println( priceOfFruit + "per" + fruitName + "is very expensive");
    }

    public static void eat (int numOfFruit, String tasteOfFruit, float price){
        System.out.println("This fruit is" + tasteOfFruit + "and I bought" + numOfFruit + " and per pound is" + price);
    }

    public static void main(String[] args) {
         Scanner objFruit = new Scanner (System.in);

        System.out.println("which fruit is your favorite?");
        String fruitName = objFruit.next();
        System.out.println( "This person's favorite fruit is " + fruitName);
        System.out.println("How many fruits are you eating?");
        int numOfFruit = objFruit.nextInt();
        System.out.println("what is the price of the fruit?");
        float priceOfFruit = objFruit.nextFloat();




    }



}
