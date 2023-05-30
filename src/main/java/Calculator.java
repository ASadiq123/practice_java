public class Calculator {

    public int calcAdd(){
        int a = 10;
        int b = 6;
        int c = a +b;

        return c;
    }

    public int calcSUB(){
        int a1 = 20;
        int b1 = 5;
        int c1 = a1 - b1;

        return c1;
    }

    public int calcMULTI(){
        int a2 = 2;
        int b2 = 4;
        int c2 = 2*4;

        return c2;

    }

    public int calcDIV(){
        int a3 = 10;
        int b3 = 5;
        int c3= 10/5;

        return c3;

    }


    public static void main (String [] args) {

        Calculator CO = new Calculator();
        int sum = CO.calcAdd();
        int minus= CO.calcSUB();
        int multi = CO.calcMULTI();
        int divide=CO.calcDIV();


        System.out.println ( "addition = " + sum);
        System.out.println ( "a1 - b1 =" + minus);
        System.out.println ( "a2 * b2 =" + multi);
        System.out.println ( "a3/b3 =" + divide);


    }
}
