public class CharCount1 {
    public static void main(String[] args) {
         String str = "Malayalam";

         int count = 0;

         for (int i = 0; i < str.length(); i++){
             if (str.charAt(i) == 'a') {
                 count ++;
             }
         }
        System.out.println( "number of time 'a' occurs is " + count);
    }
}
