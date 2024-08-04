import java.io.*;

class Person implements Serializable {
    private String name;
    private transient int age; // This field will not be serialized

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class WhileWithYield {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Serialize
        Person person = new Person("Alice", 30);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            out.writeObject(person);
        }

        // Deserialize
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println(deserializedPerson);
        }
    }
}
