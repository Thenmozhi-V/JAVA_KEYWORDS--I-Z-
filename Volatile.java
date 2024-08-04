class SharedData {
    volatile int counter = 0; // Volatile variable

    public void increment() {
        counter++;
    }
}

public class Volatile {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        data.increment();
        System.out.println("Counter: " + data.counter);
    }
}
