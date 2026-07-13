class person{
    String name = "ragul";
}
class student extends person{
    String name = "kumar";
    void display(){
        System.out.println("student name :"+name);
        System.out.println("person name:"+super.name);
    }
}
public class nam{
    public static void main(String[] args) {
        student s = new student();
        s.display();
    }
}