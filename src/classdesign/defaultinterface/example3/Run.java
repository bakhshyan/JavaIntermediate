package classdesign.defaultinterface.example3;

public interface Run {
    default int getSpeed() {
        return 10;
    }
}
