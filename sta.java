class car{
    static String company = "BMW";
    static class engine{
        void start(){
            System.out.println("engine started");
            System.out.println("company:"+company);
        }
        
    }
}




public class sta {
    public static void main(String[]args){
        car.engine e = new car.engine();
        e.start();
    }
}
