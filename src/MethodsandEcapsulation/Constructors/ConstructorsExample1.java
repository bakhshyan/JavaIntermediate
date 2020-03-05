package MethodsandEcapsulation.Constructors;

public class ConstructorsExample1 {
    private String color;
    private int weight;
    public ConstructorsExample1(String color) {
        this.color=color;
        weight=2;
    }

    public ConstructorsExample1(String color, int weight) {
        this("black");
        this.color = color;
        this.weight = weight;

    }

    public static void main(String[] args) {
        ConstructorsExample1 constructorsExample = new ConstructorsExample1("green");
        System.out.println(constructorsExample.color);
        System.out.println(constructorsExample.weight);

        ConstructorsExample1 constructorsExample1 = new ConstructorsExample1("yellow", 25);
        System.out.println(constructorsExample1.weight);
        System.out.println(constructorsExample1.color);
    }
}
