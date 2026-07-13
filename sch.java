class school{
    String schoolname = "ABC school";
    class student{
        String studentname = "arun";
        void display(){
            System.out.println("school:"+schoolname);
            System.out.println("student:"+studentname);
        }

}
}
public class sch {
    public static void main(String[] args) {
        school.student s = new school.student();
        s.display();
    }
}
 

