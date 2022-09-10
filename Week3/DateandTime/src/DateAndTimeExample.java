import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTimeExample {
    public static void main(String[] args) {
        Date date = new Date();// nowy obiekt Date zawiera aktualna godzine
        System.out.println(date.toString());


        Calendar calendar1 = Calendar.getInstance();//tworzymy nowy obiekt Calendar
        calendar1.setTime(date);//ustawiamy date i czas w kalendarzu taki sa jak byl w date
//metoda add pozwala na przesuwanie daty i czasu
        calendar1.add(Calendar.MONTH,-6);// odejmujemy 6 miesiecy
        Date before6Months = calendar1.getTime();
        System.out.println(before6Months);

        calendar1.add(Calendar.WEEK_OF_MONTH,3);//typ wyliczeniowy pisany wielki literami
        Date anothereDate = calendar1.getTime();
        System.out.println(anothereDate);

        Calendar calendar2 = GregorianCalendar.getInstance();
//        Za pomoca metody set ustawiamy konkretnne wartosci daty i czasu
        calendar2.set(Calendar.YEAR,2004);
        calendar2.set(Calendar.MONTH,4);//ineksujemy miesiace od 0
        calendar2.set(Calendar.DAY_OF_MONTH,1);
        calendar2.set(Calendar.HOUR_OF_DAY,0);
        calendar2.set(Calendar.MINUTE,0);
        calendar2.set(Calendar.SECOND,0);

        Date date1 = calendar2.getTime();
        System.out.println(date1);

//Dzien urodzin
        Calendar calendar3 = GregorianCalendar.getInstance();
        calendar3.set(Calendar.YEAR,1991);
        calendar3.set(Calendar.MONTH,6);
        calendar3.set(Calendar.DAY_OF_MONTH,1);
        calendar3.set(Calendar.HOUR_OF_DAY,0);
        calendar3.set(Calendar.MINUTE,0);
        calendar3.set(Calendar.SECOND,0);

        Date date2 = calendar3.getTime();
        System.out.println(date2);
    }
}

