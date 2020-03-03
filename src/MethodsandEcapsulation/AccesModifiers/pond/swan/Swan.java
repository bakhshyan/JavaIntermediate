package MethodsandEcapsulation.AccesModifiers.pond.swan;

import MethodsandEcapsulation.AccesModifiers.pond.shore.Bird;

public class Swan extends Bird {

    public static void main(String[] args) {
        Bird other = new Swan();
        other.publicString();
    }

    @Override
    public void protectedText() {
        super.protectedText();
    }

    @Override
    public void publicString() {
        super.publicString();
    }







}


