package methodsandecapsulation.lambdas.example4;

import java.util.Comparator;

public class LambdaExamples {
    public static void main(String[] args) {
        MyFunction myFunction = (text, number) -> {
            return text + " " + number;
        };
        String result = myFunction.apply("world", "099893231");
        System.out.println(result);


        MyFunction myFunction1 = myFunction;
        System.out.println(myFunction1.apply("hello", "09565565"));
    }
}
