package classdesign.defaultinterface.example1;

public class Implementation implements IsWarmBlooded {
    @Override
    public boolean hasScales() {
        return false;
    }

    static  double a;
    public  void AA() {
        a = getTemperature();
    }

    public static void main(String[] args) {
        new Implementation().AA();
        System.out.println(a);
    }



}
