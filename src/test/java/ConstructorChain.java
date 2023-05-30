public class ConstructorChain {

    public ConstructorChain(){
        this (9);
        System.out.println ("1st constructor");
    }

    public ConstructorChain (int num){
        this ("ada");
        System.out.println ("2nd constructor");
    }

    public ConstructorChain (String name){
    System.out.println ("3rd constructor");
    }


    public static void main (String [] args ) {
        ConstructorChain object = new ConstructorChain ();

    }



}
// this - current class object
//this () - current class constructor calling