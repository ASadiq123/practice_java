public class AccessClass {
    public static void main(String[] args) {
         BankAbstraction obj = new BOADemo();
        System.out.println("rate of interest is " + obj.calculateROI(7));

        obj = new ChaseBank();
        System.out.println("rate of interest is " + obj.calculateROI(8));




    }

}
