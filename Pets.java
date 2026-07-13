


interface Pet {         
    void play();
}                            

interface Trainable {
    void train();
}

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class PetDog extends Dog implements Pet, Trainable {

    public void play() {
        System.out.println("Dog is playing with owner");
    }

    public void train() {
        System.out.println("Dog is getting trained");
    }
}


public class Pets {
     public static void main(String[] args) {

        PetDog d = new PetDog();

        d.eat();
        d.bark();
        d.play();
        d.train();
    }
}
