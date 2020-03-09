package methodsandecapsulation.lambdas.example6;

public class LambdaExample {
    static String other1 = "Hello";
    static String a;


    public LambdaExample() {
        a = "hello1";
    }

    public static void main(String[] args) {

        MyInterfac1 myInterfac1 = text -> {
            System.out.println(other1 + " " + text);
        };
        myInterfac1.printIt("world");

    }

}
