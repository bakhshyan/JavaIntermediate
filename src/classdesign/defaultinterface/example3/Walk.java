package classdesign.defaultinterface.example3;

public interface Walk {
    default int getSpeed() {
        return 5;
    }
}
