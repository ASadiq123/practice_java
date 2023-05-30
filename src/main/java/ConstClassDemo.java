public class ConstClassDemo {  //by default constructor or predefined constructor and should be always non parameterized

    public ConstClassDemo () {   //non parameterized constructor
        System.out.print ("It's a user defined non parameterized constructor");
    }
    public ConstClassDemo (int phone) {   //parameterized constructor
        System.out.print ( "It's a user defined parameterized constructor and name is " + phone);
    }
    public ConstClassDemo (int phone, String address) {   //parameterized constructor
        System.out.print("It's a user defined parameterized constructor and name is " + phone);
    }
    public ConstClassDemo (String name, int phone) {   //parameterized constructor
        System.out.print ("It's a user defined parameterized constructor and name is " + name    +  phone);
    }





    public static void main (String []args){
        ConstClassDemo object = new ConstClassDemo(777777); }
}
