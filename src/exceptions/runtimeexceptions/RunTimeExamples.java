package exceptions.runtimeexceptions;

public class RunTimeExamples {
    public static void main(String[] args) {
        RunTimeExamples runTimeExamples = new RunTimeExamples();
        // runTimeExamples.NullPointerException();
        NumberFormatException();
    }

    static int ArithmeticException(int x, int y) {
        return x / y;
    }

    static void ArrayIndexOutOfBoundsException() {
        int[] countsOfMoosee = new int[3];
        System.out.println(countsOfMoosee[5]);
    }

    static void ClassCastException() {
        String type = "moose";
        Object obj = type;
        Integer num = (Integer) obj;
    }

    int numberOfEggs;

    void IllegalArgumentException(int numberOfEggs) {

        if (numberOfEggs >= 0) {
            this.numberOfEggs = numberOfEggs;
        } else if (numberOfEggs < 0) {
            throw new IllegalArgumentException("Nuber of eggs mustnt be negative");
        }

    }

    String name;

    void NullPointerException() {

        System.out.println(name.length());
    }

    static void NumberFormatException() {
        Integer.parseInt("11");
    }


}

