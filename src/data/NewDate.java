package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class NewDate {
    public static void main(String[] args) {
        String date = "15.01.2024 12:00:00";
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        java.util.Date d = new java.util.Date();
        Calendar c = new GregorianCalendar();
        try {
            d = format.parse(date);
            c.setTime(d);
            System.out.println((new SimpleDateFormat("dd.MM.yyyy HH:mm:ss")).format(d));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
