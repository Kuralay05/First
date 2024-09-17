import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Datadata {


        public static final long MILLIS_IN_YEAR = 31536000000L;
        public static final long MILLIS_IN_LEAP_YEAR = 31622400000L;

        public static void main(String[] args) {

            Date myDate = new Date();
            System.out.println("Your date right now: " + myDate);

            try {
                String toAddOneYear = JOptionPane.showInputDialog(null, "Enter the date in the following format \n [dd.MM.yyyy]");
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                Date parsedDate = dateFormat.parse(toAddOneYear);

                Date finalDate = addOneYearToDate(parsedDate);
                JOptionPane.showMessageDialog(null, "Your date with 1 year added: " + finalDate);

            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Your format is not correct!");
            }

        }


        public static boolean isLeapYear(int year){
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        }

        public static Date addOneYearToDate(Date parsedDate) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(parsedDate);

            int year = calendar.get(Calendar.YEAR);

            return new Date(parsedDate.getTime() + (isLeapYear(year) ? MILLIS_IN_LEAP_YEAR : MILLIS_IN_YEAR));
        }

    }
