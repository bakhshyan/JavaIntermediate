package MethodsandEcapsulation.AccesModifiers.pond.goose;

import MethodsandEcapsulation.AccesModifiers.pond.duck.DuckTeacher;

public class LostDuckling {
    public void swim() {

        DuckTeacher duckTeacher = new DuckTeacher();
        duckTeacher.swim();
        System.out.println(duckTeacher.name);
    }
}
