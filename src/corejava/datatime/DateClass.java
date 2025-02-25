package corejava.datatime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("MM/dd/yyyy");

        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println(date.toString());
        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat1.format(date));
    }
}
