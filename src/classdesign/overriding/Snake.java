package classdesign.overriding;

public class Snake extends Reptile {
    @Override
    protected boolean hasLegs()  {
        return false;
    }

    @Override
    protected double getWeight() throws InsufficientDataException {
        return 2;
    }

    @Override
    protected double getHeight()  {
        return 2;
    }

    @Override
    protected int getLength() {
        return 4;
    }
}
