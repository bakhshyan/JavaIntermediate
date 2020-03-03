package CoreJavaAPIs.DateandTimes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReviewQuestions {
    public static void main(String[] args) {
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        for (String item : hex) {
            System.out.println(item);
        }
    }
}


