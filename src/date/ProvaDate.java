package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ProvaDate {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now(); //creare una data odierna

        LocalDate data2 = LocalDate.of(2000, 5,10);

        LocalDate data3 = LocalDate.parse("2000-04-05");

        LocalDate data4 = LocalDate.parse("07/08/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println(data);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);

        System.out.println(data2.until(data, ChronoUnit.YEARS));

        LocalTime t1 = LocalTime.now();

        LocalDateTime ldt1 = LocalDateTime.now();

        System.out.println(t1);
        System.out.println(ldt1);

    }
}
