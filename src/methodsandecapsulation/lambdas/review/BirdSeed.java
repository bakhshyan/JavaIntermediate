package methodsandecapsulation.lambdas.review;

public class BirdSeed {
    private int numberBages;
    boolean call;

    public BirdSeed() {
        this(2);
        call = false;



    }

    public BirdSeed(int numberBages) {
        this.numberBages = numberBages;

    }

    public static void main(String[] args) {
        BirdSeed birdSeed = new BirdSeed();
        System.out.println(birdSeed.numberBages);
    }
}
