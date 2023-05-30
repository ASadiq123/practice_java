public class StarPattern {
    public static void main (String [] args){
        for (int i = 5; i >= 1; i -- ) {    // outer for loop   i means row  i =1

            for (int j = 1; j <= i; j++) {  // inside for loop  j means column  j= 1
                System.out.print ("*");
            }
            System.out.println ();

        }

    }
}
