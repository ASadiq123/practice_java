public class FactorialValue {
   public static int calculateFactorial(int num){
       int fact = 1;
       for (int i = 1; i <=num; i++){
           fact = fact * i;

       }
       return fact;
   }

   public int doubleFactor (int num){
       int value = num*2;
       return value;
   }


    public static void main (String [] args){
       int result = FactorialValue.calculateFactorial ( 5);
       System.out.println (result);
       FactorialValue obj1 = new FactorialValue ();
       System.out.println (obj1.doubleFactor (result));

    }

}



