abstract class sme{
    abstract void calculateSalary();
    void companyname(){
    System.out.println("developer");
    }

}
class manager extends sme{
    void calculateSalary(){
        System.out.println("manager");
    }
}
public class employee{
    public static void main(String[] args) {
        manager m = new manager();
        m.calculateSalary();
        m.companyname();
    }
}





