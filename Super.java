class Animal {
    String sound = "Animal sound";
}

class Dog extends Animal {
    String sound = "Bark";

    void printSound() {
        System.out.println(super.sound); // Accessing the superclass variable
    }
}

public class Super {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printSound();
    }
}
