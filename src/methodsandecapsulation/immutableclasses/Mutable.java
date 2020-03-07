package methodsandecapsulation.immutableclasses;

public class Mutable {
    private StringBuilder builder;//Hayk

    public Mutable(StringBuilder b) {

        builder = new StringBuilder(b);
    }

    public StringBuilder getBuilder() {

        return new StringBuilder(builder);
    }

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Hayk");
        Mutable mutable = new Mutable(a);
        a.append("Saqo");
        StringBuilder gotBuilder = mutable.getBuilder();
        gotBuilder.append("mre");
        System.out.println(mutable.getBuilder());

    }

}
