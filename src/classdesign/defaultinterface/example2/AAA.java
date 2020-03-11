package classdesign.defaultinterface.example2;

public class AAA implements SharkFamily {
    @Override
    public boolean doFinsHaveScales() {
        return false;
    }

    @Override
    public int getNumberOfFins() {
        return 0;
    }

    @Override
    public double getLongestFinLength() {
        return 0;
    }
}
