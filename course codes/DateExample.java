import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter dTformatter = DateTimeFormatter.ofPattern("HH-MM-SS YYYY-MM-DD");
        String formattedDate = dateTime.format(dTformatter);
        System.out.println(formattedDate);

    }
}
