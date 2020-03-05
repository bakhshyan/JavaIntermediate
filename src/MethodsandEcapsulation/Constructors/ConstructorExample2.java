package MethodsandEcapsulation.Constructors;

public class ConstructorExample2 {
    private int numTeeth;
    private int numWhiskers;
    private int weight;


    public ConstructorExample2(int weight) {
        this(weight, 16);
    }

    public ConstructorExample2(int weight,int numTeeth) {
        this(weight, numTeeth, 6);

    }

    public ConstructorExample2(int weight,int numTeeth,int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;

    }

    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);

    }

    public static void main(String[] args) {
        ConstructorExample2 constructorExample2 = new ConstructorExample2(15);
        constructorExample2.print();
    }
}
