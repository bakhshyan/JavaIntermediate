package methodsandecapsulation.orderofInitialization;

public class Example3 {
    static {
        new Example3();
    }

    static {
        add(2);
        new Example3();

    }

    static {
        add(4);
    }

    {
        add(6);
    }

    {
        add(8);
    }

    Example3() {
        add(5);
    }

    static void add(int num) {
        System.out.println(num + "");

    }


    public static void main(String[] args) {

    }
}
