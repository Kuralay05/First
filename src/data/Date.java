package data;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        Calendar c = new GregorianCalendar();
        System.out.println(c.getTimeInMillis());
        c.set(1980, 12, 12, 14, 0, 30);
        System.out.println(c.getTimeInMillis());
        c.set(GregorianCalendar.YEAR, 2023);
        System.out.println(c.getTimeInMillis());
    }
}
