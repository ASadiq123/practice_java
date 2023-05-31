package org.example;

public class DemoPractice {

    char abc = 'V';
    static String s = "this is our 1st automation class";
    double b = 10.23;
    static int c = 30;

    final String name;
    final String age;
    final String phone;

    public DemoPractice (String name,String age, String phone ) {

        this.name = name;
        this.age = age;
        this.phone = phone;
    }





    int value = 10;

    public void sum() {
        int a = 15;
        System.out.print("local variable a of sum method = +a");

    }
    public static void minus () {
            int a = 20;
            System. out. print ("static method a =  +a");

        }

     public static void main (String args[])   {
        DemoPractice obj1 = new DemoPractice ("aida", "25", "333434f");
        DemoPractice obj2 = new DemoPractice ("keua", "30", "883893938");


        System. out. println (obj1. name + obj1.age + obj1.phone);
         System.out.println( obj2.name + obj2.age + obj2.phone);

     }

}
