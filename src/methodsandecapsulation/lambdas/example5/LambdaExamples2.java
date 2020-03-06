package methodsandecapsulation.lambdas.example5;

public class LambdaExamples2 {

    public static void main(String[] args) {
        MyInterface myInterface = text -> System.out.println(text);

        myInterface.printIt("a");
        myInterface.printUTF8("a", 2);
        MyInterface.printToSystemOut("another");
    }
}
