public class OperatorLearn {
    public static void main (String [] args){

        //postfix unary operator ++ or -- after variable

        int num = 10;
        int num2 = 20;

        System.out.println ( num++ + "  || " + --num);

        System.out.println ( num ++);  //num = 10
        System.out.println (num);      // num is 11

        System.out.println ( num2 --);  //default value = 20
        System.out.println (num2);     //updated value = 19

        //prefix unary operator ++ or -- after variable

        int num3 = 30;
        int num4 = 40;
        System.out.println (--num3);
        System.out.println (++num4);








    }


}
