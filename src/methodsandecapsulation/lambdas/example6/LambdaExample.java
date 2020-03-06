package methodsandecapsulation.lambdas.example6;

import javax.swing.text.View;

public class LambdaExample {
    static String other1 = "Hello";
    final static String a;


    public LambdaExample() {
        a = "hello1";
    }

    public static void main(String[] args) {

        other1 = "2";

        MyInterface myInterface = text -> System.out.println(a + " " + text);
        other1 = "1";
        myInterface.printIt("world");

    }

}
