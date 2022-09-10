import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[ab]+c");//tutaj kompilujemy wzorzec wyrazenia regularnego
        //tworzymy obiekt typu Matcher dla wzorca pattern na sprawdzanym ciagu znakow
        Matcher matcher = pattern.matcher("abcd");

        System.out.println(matcher.matches()); //zwraca tru lub false
        System.out.println(matcher.find());

        System.out.println("sprawdzenia wywolania matches w linii: ");
//        nie musimy zapamietywac za każdym razem obiektu typu Matcher:
        System.out.println(pattern.matcher("aaaaaaac").matches());
        System.out.println(pattern.matcher("aaasaaac").matches());

        System.out.println();

//        Zadanie 1 Słowo zaczyna ABC, konczy sie na apa
        System.out.println("Zad1");
        Pattern zad1 = Pattern.compile("[ABC]apa");
        System.out.println(zad1.matcher("Apa").matches());
        System.out.println(zad1.matcher("Bpa").matches());
        System.out.println(zad1.matcher("DBpa").matches());

        System.out.println();

//        Zadanie 2
        //Słowo zaczyna się od wielkiej litery z wyjątkiem A, następnie występują minimalnie
        // 4 małe litery ale nie więcej niż 7, kończy się dwoma cyframi z zakresu 0-5.
        System.out.println("Zad2");
        Pattern zad2 = Pattern.compile("[B-Z][a-z]{4,7}[0-5]{2}");
        System.out.println(zad2.matcher("Babcd12").matches());
        System.out.println(zad2.matcher("Cabcdefg40").matches());
        System.out.println(zad2.matcher("Cabcdefg57").matches());

        System.out.println();
    }
}
