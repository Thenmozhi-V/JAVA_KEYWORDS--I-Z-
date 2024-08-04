class Animal {
    protected String sound;

    protected void makeSound() {
        System.out.println(sound);
    }
}

class Dog extends Animal {
    public Dog() {
        sound = "Bark";
    }
}

public class Protected {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}

