package classdesign.polymorphism.example1;

public class Lemur extends Primate implements HasTail {
    @Override
    public boolean isTailStriped() {
        return false;
    }

    public  int age=10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);//10

        HasTail  hasTail= lemur;
        System.out.println(hasTail.isTailStriped());//false

        Primate primate = lemur;
        System.out.println(primate.hasHair());//true




    }
}
