package methodsandecapsulation.lambdas.example3.tetr;

public class Tetr {

    public interface TertelListener {
        void onTertel(Tetr tetr);
    }

    public interface OpenCloseListener {
        void onOpen(Tetr tetr);
        void onClose(Tetr tetr);
    }


    private OpenCloseListener openCloseListener;

    public void setOpenCloseListener(OpenCloseListener _openCloseListener) {
        this.openCloseListener = _openCloseListener;
    }


    void pakel() {
        if (openCloseListener != null) {
            openCloseListener.onClose(this);
        }
    }

}
