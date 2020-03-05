package MethodsandEcapsulation.ImmutableClasses;

public class NotImmutable {
    private StringBuilder builder;

    public NotImmutable(StringBuilder b) {
        builder = b;
    }

    public StringBuilder getBuilder() {
        return builder;
    }

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Hayk");//
        NotImmutable notImmutable = new NotImmutable(a);
        a.append("Saqo");
        StringBuilder gotBuilder = notImmutable.getBuilder();
        gotBuilder.append("mre");
        System.out.println(notImmutable.getBuilder());

    }

}
