class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";

    void display() {
        System.out.println("Child color: " + color);
        System.out.println("Parent color: " + super.color);
    }
}

public class parent {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}