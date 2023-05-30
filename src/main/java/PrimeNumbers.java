public class PrimeNumbers {





    public static void main (String[] args) {
            int num = 50, count ;

            for (int i = 0; i <= num; i++) {
                count = 1;
                for (int j = 2; j<= i/2; j++){
                    if (i%j == 0){
                        count++;
                        break;

                    }
                }
                if (count ==1)







                    System.out.println (i);
        }

    }
    }






