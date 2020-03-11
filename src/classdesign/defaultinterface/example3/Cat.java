package classdesign.defaultinterface.example3;

public class Cat implements Run,Walk {
    @Override
    public int getSpeed() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }

}
