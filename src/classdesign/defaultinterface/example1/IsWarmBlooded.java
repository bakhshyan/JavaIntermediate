package classdesign.defaultinterface.example1;

 interface IsWarmBlooded {

    boolean hasScales();

     default double getTemperature() {
        return 10.0;
    }

}
