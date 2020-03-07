package methodsandecapsulation.lambdas.example2;

public interface FuncInterface {
    void abstarctfun();

     default void normalFun() {
        System.out.println("Hello");
    }
}

