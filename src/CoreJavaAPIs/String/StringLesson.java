package CoreJavaAPIs.String;

public class StringLesson {
    public static void main(String[] args) {
        /** StringBuilder sb = new StringBuilder("animals");
         sb = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
         int len = sb.length();
         char ch = sb.charAt(6);
         System.out.println(sub + " " + len + " " + ch);**/

        StringBuilder sb = new StringBuilder("abcdef");
        sb.deleteCharAt(5);
    }
}
