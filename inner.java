class A{
    void show(){
        class B{
            void display(){
                System.out.println("hello from local inner class");
            }
        }
        B b= new B();
        b.display();
    }
    
}





public class inner {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }

    
}
