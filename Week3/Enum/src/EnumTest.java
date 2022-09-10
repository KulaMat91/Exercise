import java.util.Calendar;
import java.util.GregorianCalendar;

public class EnumTest {

    public static void main( String[] args ) {
        Colour colour1 = Colour.RED; // tworzymy obiekt typu wyliczeniowego colour RED
        Colour colour2 = Colour.BLUE;

        System.out.println(colour1.getR());
        System.out.println(colour1);// wyswietlamy skladowe RGB koloru czerwonego
        System.out.println(Colour.GREEN);

//      Przyklad zastosowania enuma od plci danej osoby // wpisac zmienna gender na koncu
        Person person1 = new Person("John", "Nowak", 18);


    }
}
