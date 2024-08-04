class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name: " + this.name);
    }
}

public class This {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.printName();
    }
}