package checklocale;

import java.util.Calendar;
import java.util.Date;

public class CheckLocale {
    
    public static void main(String[] args) {        
        System.out.println(java.util.Locale.getDefault ());
        
        Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("DAY_OF_WEEK = " + dayOfWeek);
    }
    
}
