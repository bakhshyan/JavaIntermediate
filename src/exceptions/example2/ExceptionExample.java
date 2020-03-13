package exceptions.example2;

public class ExceptionExample {

    public String exceptions() {
        String result = "";
        String v = null;

        try {
            try {
                result += "before";
                v.length();
                result += "after";
            } catch (NullPointerException e) {
                result += "cath";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ExceptionExample().exceptions());
    }
}
