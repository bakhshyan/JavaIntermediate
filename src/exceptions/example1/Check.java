package exceptions.example1;

public class Check {
    void explore() {
        try {
            fall();
        } catch (Exception e) {
            System.out.println("get up");
        }

        finally {
            System.out.println("Finally");
        }

    }

    void fall()  {
       // throw new RuntimeException();
    }

    public static void main(String[] args) {
        new Check().explore();
    }
}
