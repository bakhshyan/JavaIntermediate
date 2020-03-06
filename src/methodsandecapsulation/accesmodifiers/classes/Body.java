package methodsandecapsulation.accesmodifiers.classes;

public class Body {
    public String door;

    protected  String window;

    protected void windowOpen(){
        System.out.println("Body class windowOpen");
    }

    protected void doorOpen() {
        System.out.println("Body class doorOpen");
    }
}
