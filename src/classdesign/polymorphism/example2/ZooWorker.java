package classdesign.polymorphism.example2;

public class ZooWorker {
    public static void feed(Reptile reptile) {
        System.out.println("Feeding reptile" + reptile.getName());

    }

    public static void main(String[] args) {
        feed(new Alligator());
        feed(new Crorcodile());
        feed(new Reptile());
    }
}
