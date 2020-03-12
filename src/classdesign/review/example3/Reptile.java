package classdesign.review.example3;

public abstract class Reptile {
    public final void layEggs() {
        System.out.println("Reptile");
    }

     abstract void A();
    public static void main(String[] args) {
        Reptile reptile = new Lizard();
        reptile.layEggs();
    }
}
