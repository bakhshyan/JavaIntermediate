package methodsandecapsulation.lambdas.review;

public class Cheetah {

    int numSpots;

    public Cheetah(int numSpots) {
        this.numSpots = numSpots;

    }

    public static void main(String[] args) {
        System.out.println(new Cheetah(50).numSpots);
    }
}
