package methodsandecapsulation.lambdas.review;

public class Test {
    public void print(byte x) {
        System.out.println("Byte");
    }

    public void print(int x) {
        System.out.println("int");
    }

    public void print(float x) {
        System.out.println("float");

    }

    public void print(Object x) {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        Test test = new Test();
        short s = 123;
        test.print(s);//int
        test.print(true);//object
        test.print(6.789);//object
    }
}
