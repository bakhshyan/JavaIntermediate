package MethodsandEcapsulation.AccesModifiers.Classes;

public class Equipment extends Body {

    @Override
    public void windowOpen() {
        System.out.println("Equipment class windowOpen");
    }

    @Override
    public void doorOpen() {
        System.out.println("Equipment class windowOpen");
    }

    public void equipmentSet() {
//        windowOpen();
//        doorOpen();
        Body body = new Equipment();
        body.windowOpen();


    }
}
