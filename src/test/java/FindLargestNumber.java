public class FindLargestNumber {
    //nonstatic method
    public void findLargest (int num1,int num2){
        if (num2 > num1) {
            System.out.println("Largest number is "+ num1);
        }
        else
            System.out.println( "Largest number is " + num2);
    }

    //static method

    public static void findLargestbyStatic (int num1, int num2){
        if (num1>num2){
            System.out.println( "Static Largest number is " + num1);
        }
        else
            System.out.println( "Static Largest number is " + num2);
    }

    public static void main(String[] args) {
         FindLargestNumber FN = new FindLargestNumber();
         FN.findLargest (10,30);
         FindLargestNumber.findLargestbyStatic(20, 40);
    }


}
