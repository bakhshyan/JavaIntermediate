package methodsandecapsulation.lambdas.example3.book;

public class Book {

    public interface OpenCloseListener {
        void onOpen(Book book);
        void onClose(Book book);
    }

    public interface TertelListener {
        void onTertel(Book book);
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
