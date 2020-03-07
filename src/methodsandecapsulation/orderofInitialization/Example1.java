package methodsandecapsulation.orderofInitialization;

public class Example1 {
    private String name = "Torchie";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    static {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public Example1() {

        System.out.println("constructor");
    }

    public static void main(String[] args) {

        Example1 example = new Example1();
    }
}
