public class Static {
    public static void main(String[] args) {
        System.out.println("Static method call: " + StaticExample.getStaticValue());
    }
}

class StaticExample {
    private static int staticValue = 100;

    public static int getStaticValue() {
        return staticValue;
    }
}
