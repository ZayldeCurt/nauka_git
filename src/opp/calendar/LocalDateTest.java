package opp.calendar;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTest {
    private static int counter=0;
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfWeek());
        int actualsecond=0;
        while(counter!=100)
        {
            if(actualsecond!=LocalTime.now().getSecond())
            {
                counter++;
                System.out.println(LocalTime.now().getSecond());
                actualsecond= LocalTime.now().getSecond();
            }
            else
            {
//                actualsecond= LocalTime.now().getSecond();
            }

        }

    }

}
