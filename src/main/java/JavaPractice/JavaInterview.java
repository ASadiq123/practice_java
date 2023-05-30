package JavaPractice;

public class JavaInterview{

    public int demo (){

        int a = 2;
        int b = 4;
        int c = a + b;

        return c;

    }

    public static void main (String [] args){
        JavaInterview JT = new JavaInterview ();
        int sum = JT.demo ();
        System.out.println ("2 + 4 = " + sum);

    }

}