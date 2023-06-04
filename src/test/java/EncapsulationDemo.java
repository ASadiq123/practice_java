public class EncapsulationDemo {
    private String pwd;  // data member or variables


    //setter method = set the value
    public void setPwd(String data) {  //data = unique name or identifier
        this.pwd = data;
    }


    //getter method = get the value
    public String getPwd() {  //method
        return this.pwd;

    }


    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setPwd("admin");
        System.out.println(obj.getPwd());

    }
}