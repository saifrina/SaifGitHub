package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
    public static String returnNextMonth(){
        //Creating Date Objects
        Date dNow = new Date();

        //Creating calendar objct for Gregorian Calendar
        Calendar calendar = new GregorianCalendar();

        calendar.setTime(dNow);

        //Create object of SimpleDateFormat
        //Defining Date Format to - example: (Dec- 2021)
        SimpleDateFormat sdf = new SimpleDateFormat("MMM-yyyy");

        //Incrementing the current month
        calendar.add(Calendar.MONTH, 1);
        String date = sdf.format(calendar.getTime());

        return date;

    }
}
