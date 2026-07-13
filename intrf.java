interface animal
{
    void sound();

}
class dog implements animal
{
public void sound()
{
    System.out.println("dog barks");
}
}

public class intrf
{
    public static void main(String[] args) {
        dog d=new dog();
        d.sound(); 
    }
}