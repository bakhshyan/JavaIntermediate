package MethodsandEcapsulation.AccesModifiers.pond.goose;

import MethodsandEcapsulation.AccesModifiers.pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim() {
        Bird bird = new Bird();

    }
}
