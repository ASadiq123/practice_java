

public class Fruit {

    public static void eat (){
        System.out.println("I am not eating fruit");
    }

    public static void eat (String fruitName) {
        System.out.println(fruitName);
    }

    public static void eat (int noofFruit){

        System.out.println("I am eating " + +noofFruit + " banana");
    }

    public static void main (String [] args){
        eat ();
        eat ("banana");
        eat (5 );

    }

}
