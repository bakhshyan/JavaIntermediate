package corejavaAPIs.dateandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateEducation {
    public static void main(String[] args) {
        locaclDateCreate();
//        System.out.println(LocalTime.of(6, 15));

    }

    public static void locaclDateCreate() {
        LocalDate date1 = LocalDate.of(2015, Month.APRIL, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        date2=date2.minusDays(2);
        LocalDateTime date3 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
//        System.out.println(date1);
        System.out.println(date2);
//        System.out.println(date3);
    }
}
