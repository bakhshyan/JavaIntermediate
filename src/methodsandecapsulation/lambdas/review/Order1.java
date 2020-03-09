package methodsandecapsulation.lambdas.review;

public class Order1 {
    static String result = "";

    {
        result += "c";
    }

    static {
        result += "u";
    }

    {
        result += "r";
    }

    public static void main(String[] args) {
        System.out.println(Order1.result + " ");//u
        System.out.println(Order1.result + " ");//u
        new Order1();//
        new Order1();//
        System.out.println(Order1.result + " ");//
    }
}
