class animal{
    animal(String name){
        System.out.println("animal:"+name);
    }
}
class dog extends animal{
    dog(){
        super("tommy");
        System.out.println("dog constructor");
    }
}
    
public class main {
    public static void main(String[]args){
    dog d = new  dog();
    }
}
