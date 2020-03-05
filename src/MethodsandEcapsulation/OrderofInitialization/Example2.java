package MethodsandEcapsulation.OrderofInitialization;

public class Example2 {
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

    public Example2() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("read to construct");
        //Example2 example2=new Example2();
    }
}
