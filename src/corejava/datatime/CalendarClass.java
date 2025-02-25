package corejava.datatime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClass {



    public static void main(String[] args) {

        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    }
}
