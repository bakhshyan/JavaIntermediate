package CoreJavaAPIs.DateandTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class AnimalEnrichment {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimal(start, end);
    }
    public static  void performAnimal(LocalDate start,LocalDate end){
        if (start.isBefore(end)) {
            System.out.println("give new toy" + start);
            start = start.plusMonths(1);
            System.out.println(start);
        }

    }
}
