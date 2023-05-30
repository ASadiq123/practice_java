import javax.swing.*;

public class ArithmaticScope {

    public static void main (String [] args){

        //this operator application for numeric value

        int num = 10;
        int num2 = 20;

        //addtion then we use + sign
        System.out.println (num + num2);

        //addtion then we use - sign
        System.out.println (num - num2);

        //multipilication (*)
        System.out.println ( num * num2);

        // euality operator
        if ((num + num2) != 20){          //if true then if block will execute
            System.out.println ("value matched");

        }

        else
            System.out.println ("value not matched");

        //logical and && And Logical OR ||
        //Syntax of logical && operator: if (conditon 1 && condition 2) { // if anyoen of the condition is false then it will return falso
        //Syntax of logical || oeprator : if (condition 1 || conditon 2) {// if anyone of the condition should be true then it will return true)]

        if (4 == 4  || 3 != 3) {
            System.out.println ("true");
        }
        else
            System.out.println ("false");





    }

}
