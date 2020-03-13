package exceptions.errors;

public class ErrorsExamples {

    //**ExceptionInInitializerError** //
////    static {
////        int[] countsOfMoose = new int[3];
////        int num = countsOfMoose[-1];
////    }

    public static void main(String[] args) {
        doNotCodeThis(1);
    }

    //stackoverflowerror
    static void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }
}
