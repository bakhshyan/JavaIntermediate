package methodsandecapsulation.lambdas.example7;

import methodsandecapsulation.lambdas.example1.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class PredicateSearch {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        print(animals,animal -> animal.CanHop());
    }
    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.println(animal + " ");
            }
            System.out.println();
        }
    }
}
