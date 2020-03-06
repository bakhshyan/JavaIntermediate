package methodsandecapsulation.lambdas.example5;

import java.io.OutputStream;

public interface MyInterface {
    void printIt(String text);

    default void printUTF8(String text, int number) {
        System.out.println(text + " " + number);
    }

    static void printToSystemOut(String text) {
        System.out.println(text);
    }

}
