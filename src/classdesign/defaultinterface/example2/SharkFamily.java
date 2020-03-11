package classdesign.defaultinterface.example2;

public interface SharkFamily extends HasFins {
    default int getNumberOfFins() {
        return 8;
    }

    double getLongestFinLength();


}
