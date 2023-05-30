public class LargestNumber {
    public int Large (int numberOne, int numberTwo){
        if (numberTwo > numberOne){
            System.out.println ("The biggest number between " + numberOne + " and " + numberTwo + " is " + numberTwo);
            return numberTwo;
        }
        else {
            System.out.println ("The biggest number between " + numberOne + " and " + numberTwo + " is " + numberOne);
            return numberOne;

        }
    }

    public static void main (String [] args){
        LargestNumber obj1 = new LargestNumber ();
        int outcome = obj1.Large (2, 3);


    }

}
