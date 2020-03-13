package exceptions.example1;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Main().myFunction(0));
    }

    Integer myFunction(Integer x) {
        Integer y = 0;
        if (x > 10) {
            return 10000;
        }

        try {
            //y = 10 / x;
            return 10 / x;
        } catch (Exception e) {
            //y = 10;
            return 10;
        }finally {
            //y = 200;
            return 200;
        }

    }
}
