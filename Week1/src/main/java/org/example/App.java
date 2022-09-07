package org.example;
import java.util.Scanner;
/**
 * Zadania po kolei
 *
 */

/**
 * Stringi
 *
 */
//public class App
//{
//    public static void main( String[] args ) {
//        System.out.println( "Hello World!" );
//
//        // string - teksty
//        String text = "This is some text in a string variable!";
//
//        System.out.println(text);
//
//
//
//        String firstWord = "Hello, ";
//        String secondWord = "World! ";
//        String thirdWord = "Nice ";
//        String fourthWord = "to ";
//        String fifthWord = "meet ";
//        String sixthWord = "you!";
//
//        String message = firstWord + secondWord + thirdWord + fourthWord + fifthWord + sixthWord;
//
//        System.out.println(message);
//
//    }
//}

/**
 * Scanner
 *
 */
//public class App
//{
//    public static void main( String[] args ) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Whats your name?");
//        String name = scanner.nextLine();
//
//        System.out.println("Whats your last name?");
//        String surname = scanner.nextLine();
//        String full = "Hello " + name + " " + surname + "!";
//        System.out.println(full);
//// zawartosc stringa name.equals , gdy porownujemy tekst
//// inaczej ==
////        == - równość
////                != - nierówność
////                > - większy
////                < - mniejszy
////                >= - większy lub równy
//// <= - mniejszy lub równy
//// Do porównywania stringów używamy .equals()
//
//        if (name.equals("") && surname.equals("")){
//            System.out.println("Hello, unknow!");
//        }
//        else {
//            System.out.println("Hello, " + name + " " + surname + "!");
//        }
//    }
//}

/**
 * Int+Double
 *
 */
//public class App
//{
//    public static void main( String[] args ) {
//
//        //int (Integer) - liczba całkowita
//        Integer num = 1;
//        System.out.println(num);
//
//        int a = 17;
//        int b = 3;
//        int sum = a + b;
//        int min = a - b;
//        int mult = a * b;
//        int div = a / b;
//        int modulo = a % b;
//
//        System.out.println(sum);
//        System.out.println(min);
//        System.out.println(mult);
//        System.out.println(div);
//        System.out.println(modulo);
//        System.out.println((a)+ " " + "+" + " " + (b) + " " + "=" + " " + (sum));
//        System.out.println((a)+ " " + "-" + " " + (b) + " " + "=" + " " + (min));
//        System.out.println((a)+ " " + "*" + " " + (b) + " " + "=" + " " + (mult));
//        System.out.println((a)+ " " + "/" + " " + (b) + " " + "=" + " " + (div));
//        System.out.println((a)+ " " + "%" + " " + (b) + " " + "=" + " " + (modulo));
//
//        // podwójna precyzja (double precision floating point number)
//        Double x = 1.5;
//        Double y = 2.75;
//
//        Double dd = x + y;
//        Double mi = x - y;
//        Double mn = x * y;
//        Double dz = x / y;
//        Double po = Math.pow(x,y);
//        Double pi = Math.sqrt(x);
//
//        System.out.println(dd);
//        System.out.println(mi);
//        System.out.println(mn);
//        System.out.println(dz);
//        System.out.println(po);
//        System.out.println(pi);
//        System.out.println(x.toString() + " " + "+" + " " + y.toString() + " " + "=" + " " + dd.toString());
//        System.out.println(x + " + " + y + " " + " = " + " " + dd);
//        System.out.println(x.toString() + " + " + y.toString() + " = " + dd.toString());
//        System.out.println((x) + " " + "-" + " " + (y) + " " + "=" + " " + (mi));
//        System.out.println(x.toString() + " " + "*" + " " + y.toString() + " " + "=" + " " + mn.toString());
//        System.out.println(x.toString() + " " + "/" + " " + y.toString() + " " + "=" + " " + dz.toString());
//        System.out.println(x.toString() + " " + "^" + " " + y.toString() + " " + "=" + " " + po.toString());
//        System.out.println(x.toString() +  " sqrt "  + " = " + pi.toString());

//    }
//}

/**
 * Zadanie wiek alkohol Int+Double
 *
 */
//public class App
//{
//    public static void main( String[] args ) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How old you are?");
//        Integer age = scanner.nextInt();
//
//        if(age >= 18 && age < 80){
//            System.out.println("You can buy alcohol.");
//        }
//        else if (age >= 80) {
//            System.out.println("You to old!");
//        }
//        else {
//            System.out.println("Get lost kid!");
//        }
//    }
//}
/**
 * Zadanie parzyste / nieparzyste
 *
 */
//public class App
//{
//    public static void main( String[] args ) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write real number?");
//        Integer number = scanner.nextInt();
//
//        if(number % 2 == 0 ){
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }
//    }
//}

/**
 * Zadanie kalkulator
 * Zaprogramuj prosty kalkulator, który umożliwia dodawanie, odejmowanie, mnożenie i dzielenie liczb rzeczywistych (tzn z ułamkami).
 * Użytkownik wpisuje dwie liczby oraz znak operacji (+, -, *, /), a następnie wyświetlony jest wynik w formacie: x + y = z.
 * Dodatkowe punkty:
 *
 *     Potęgowanie (^)
 *     Wykrywanie dzielenia przez zero (wtedy kalkulator wyświetla odpowiedni komunikat, zamiast wyniku)
 */
//public class App
//{
//    public static void main( String[] args ) {
//        System.out.println("Hello this is calculator!");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write first number?");
//        Double a = scanner.nextDouble();
//        System.out.println("Write second number?");
//        Double b = scanner.nextDouble();
//
//        scanner.nextLine();
//        System.out.println("Choose your option: +, -, *, /, ^, ");
//        String action = scanner.nextLine();
//
//        if (action.equals("+")){
//            Double sum = a + b;
//            System.out.println(a + " + " + b + " = " + sum);
//        }
//        else if (action.equals("-")) {
//            Double mi = a - b;
//            System.out.println((a) + " - " + (b) + " = " + (mi));
//        }
//        else if (action.equals("*")) {
//            Double mu = a * b;
//            System.out.println((a) + " * " + (b) + " = " + (mu));
//        }
//        else if (action.equals("/")) {
//            if (b == 0){
//                System.out.println("You cannot divide by 0!");
//            }
//            else {
//                Double di = a / b;
//                System.out.println((a) + " / " + (b) + " = " + (di));
//            }
//        }
//        else if (action.equals("^")) {
//            Double po = Math.pow(a,b);
//            System.out.println((a) + " ^ " + (b) + " = " + (po));
//        }
//        else
//            System.out.println("Wrong action!");
//    }
//}

/**
 * Switch
 *
 */
//public class App
//{
//    public static void main( String[] args ) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write digit?");
//        Integer number = scanner.nextInt();
//
//        String wordDigit;
//
//        switch (number) {
//            case 0:
//                wordDigit = "Zero";
//                break;
//            case 1:
//                wordDigit = "One";
//                break;
//            case 2:
//                wordDigit = "Two";
//                break;
//            case 3:
//                wordDigit = "Three";
//                break;
//            case 4:
//                wordDigit = "Four";
//                break;
//            default:
//                wordDigit = "Nothing";
//                break;
//        }
//        System.out.println(wordDigit);
//        //modern digit
//
//       wordDigit = switch (number) {
//            case 0 -> "Zero";
//            case 1 -> "One";
//            case 2 -> "Two";
//            case 3 -> "Three";
//            case 4 -> "Four";
//            default -> "Wrong";
//        };
//        System.out.println(wordDigit);
//    }
//}

/**
 * Kalkulator + switch
 *
 */
//public class App
//{
//    public static void main( String[] args ) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write first real number?");
//        Double a = scanner.nextDouble();
//        System.out.println("Write second real number?");
//        Double b = scanner.nextDouble();
//
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Choose your option: +, -, *, /, ^, ");
//        String action = scanner1.nextLine();
//
//        Double result = switch (action) {
//                case "+" -> a + b;
//                case "-" -> a - b;
//                case "*" -> a * b;
//                case "/" -> a / b;
//                case "^" -> Math.pow(a,b);
//            default -> null;
//        };
//
//        if (result == null){
//            System.out.println("Wrong action!");
//        }
//
//        else {
//            System.out.println(a + " " + action + " " + b + " = " + result);
//        }
//    }
//}

/**
 * While
 *
 */
//public class App
//{
//    public static void main( String[] args ) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write real number?");
//        Integer number = scanner.nextInt();
//
//        while (number <= 1000){
//            System.out.println(number);
//            number++;
//        }
//    }
//}
/**
 * Zadanie 1: Potęgowanie
 * Napisz program, który potęguje dane dwie liczby (a do potęgi b) bez użycia funkcji Math.pow
 */
//public class App
//{
//    public static void main( String[] args ) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write number?");
//        Integer a = scanner.nextInt();
//        System.out.println("To what power, write number?");
//        Integer b = scanner.nextInt();
//
//        Integer c = 1;
//        Integer x = b;
//
//        while (b > 0){
//            c = c*a;
//            b--;
//        }
//        System.out.println(a + " ^ " + x + " = " + c);
//    }
//}
// INNY SPOSOB //
//public class App
//{
//    public static void main( String[] args ) {
//        System.out.println("Choose first number: ");
//        Scanner scanner = new Scanner(System.in);
//        Integer a = scanner.nextInt();
//        System.out.println("Choose what power: ");
//        Integer b = scanner.nextInt();
//        Integer x = 1;
//        Integer c = 1;
//        while (x <= b){
//            c = a * c;
//          x++;
//        }
//        System.out.println(a + " ^ " + b + " = " + c);
//        }
//    }

/**
 * Zadanie 2.
 * Napisz program, który oblicza silnię dla danej liczby.
 * Silnia to:
 * Silnia z 1 = 1
 * Silnia z 2 = 1 * 2 = 2
 * Silnia z 3 = 1 * 2 * 3 = 6
 * Itd
 */
//public class App
//{
//    public static void main( String[] args ) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write number?");
//        Integer a = scanner.nextInt();
//
//        Integer result = 1;
//        Integer c = 1;
//
//        if (a == 0){
//            System.out.println(result);
//        }
//        else {
//            while (c <= a) {
//                result = result * c;
//                c++;
//            }
//            System.out.println("Silnia " + a + " = " + result);
//        }
//    }
//}

/**
 * Zadanie 3.
         * Napisz program, który dla podanej liczby n wypisuje n-ty wyraz ciągu Fibonacciego
         * Ciąg Fibonacciego:
         * Wyraz 1 = 0
         * Wyraz 2 = 1
         * Wyraz 3 = 0 + 1 = 1
         * Wyraz 4 = 1 + 1 = 2
         * Wyraz 5 = 1 + 2 = 3
         * Wyraz 6 = 2 + 3 = 5
         * Wyraz 7 = 5 + 3 = 8
         * Wyraz 8 = 8 + 5 = 13
         * Itd
         */

//public class App
//{
//    public static void main( String[] args ) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write number?");
//        Integer a = scanner.nextInt();
//
//        Integer first = 0;
//        Integer second = 1;
//        Integer result = 0;
//        Integer c = 3;
//
//       if (a == 1){
//           System.out.println("Result is = " + first);
//       }
//       else if (a == 2) {
//           System.out.println("Result is = " + second);
//       }
//       else {
//           while (c <= a) {
//               result = first + second;
//               first = second;
//               second = result;
//               c++;
//           }
//           System.out.println("Result is = " + result);
//       }
//    }
//}


/**
 Zad 4 FizzBuzz!
 Napisz program "FizzBuzz", który wypisuje liczby od 1 do 100 według danych zasad:

 jeżeli liczba jest podzielna przez 3, napisz Fizz
 jeżeli liczba jest podzielna przez 5, napisz Buzz
 jeżeli liczba jest podzielna przez 3 i przez 5, napisz FizzBuzz
 w przeciwnym wypadku, napisz tą liczbę
        */

//public class App
//{
//    public static void main( String[] args ) {
//
//        Integer a = 1;
//
//            while (a <= 100) {
//               if (a % 15 == 0){
//                   System.out.println("FizzBuzz");
//            }
//               else if (a % 3 == 0) {
//                   System.out.println("Fizz");
//               }
//               else if (a % 5 == 0) {
//                   System.out.println("Buzz");
//               }
//               else {
//                   System.out.println(a);
//               }
//               a++;
//            }
//    }
//}
/**
 * Zadanie Grupowe
 * Komputer losuje 3 cyfry (0-9). Użytkownik ma za zadanie je odgadnąć w takiej samej kolejności, co komputer (wpisać).
 * Komputer po każdej odpowiedzi udziela informacji zwrotnej.
 * Zasady informacji zwrotnej:
 *
 *  Jeżeli podana cyfra jest nieprawidłowa (komputer jej nie wylosował), to podana jest wiadomość COLD
 *     Jeżeli podana cyfra została wylosowana przez komputer, ale w innym miejscu, to podana jest wiadomość WARM
 *     Jeżeli podana cyfra jest prawidłowa, to podana jest wiadomość HOT
 *     Gra się toczy aż użytkownik odgadnie wszystkie liczby (aż do wiadomości HOT HOT HOT)
 *
 * Przykład: wylosowano cyfry 123. Użytkownik podaje odpowiedź 134. Dostaje odpowiedź HOT WARM COLD (1 jest prawidłowa, 3 jest na niewłaściwym miejscu,
 * 4 jest nieprawidłowa).Losowanie jednego inta:
 *Poziomy trudności - na początku użytkownik może wybrać poziom trudności, który daje odpowiednią liczbę żyć (Easy = 8, Medium = 5, Hard = 3).
 *Za każdą odpowiedź, która nie jest HOT HOT HOT, gracz traci jedno życie. Jeżeli gracz straci wszystkie życia, przegrywa.
 */
//import java.util.concurrent.ThreadLocalRandom;
//public class App
//{
//    public static void main( String[] args ) {
//
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Please choose level EASY = 8, MEDIUM = 5, HARD = 3");
//        Integer level = scanner1.nextInt();
//
//        while (level != 8 && level != 5 && level != 3) {
//            System.out.println("Choose proper level!");
//            level = scanner1.nextInt();
//        }
//
//        Integer randomInteger1 = ThreadLocalRandom.current().nextInt(10);
//        Integer randomInteger2 = ThreadLocalRandom.current().nextInt(10);
//        Integer randomInteger3 = ThreadLocalRandom.current().nextInt(10);
//
//        while (randomInteger1 == randomInteger2){
//            randomInteger2 = ThreadLocalRandom.current().nextInt(10);
//        }
//        while (randomInteger2 == randomInteger3 || randomInteger1 == randomInteger3){
//                randomInteger3 = ThreadLocalRandom.current().nextInt(10);
//            }
//
//        //Wyswietlanie cyfr ktore wylosowal komputer
//        System.out.println(randomInteger1);
//        System.out.println(randomInteger2);
//        System.out.println(randomInteger3);
//
//        Integer a = 10;
//        Integer b= 10;
//        Integer c = 10;
//        Integer life = level;
//
//
//        int i = 1;
//        while(i <= level && (a != randomInteger1 || b != randomInteger2 || c != randomInteger3)){
//
////Ilosc szans
//            System.out.println("Life left = " + life);
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Choose first digit.");
//            a = scanner.nextInt();
//
//            System.out.println("Choose second digit, must be diffrent.");
//            b = scanner.nextInt();
//
//            System.out.println("Choose third digit, must be diffrent.");
//            c = scanner.nextInt();
//
//            // SPRAWDZENIE DLA PIERWSZEJ CYFRY
//            if (randomInteger1 == a) {
//                System.out.println("HOT");
//            } else if (randomInteger2 == a || randomInteger3 == a) {
//                System.out.println("WARM");
//            } else {
//                System.out.println("COLD");
//            }
//
//            // SPRAWDZENIE DLA DRUGIEJ CYFRY
//            if (randomInteger2 == b) {
//                System.out.println("HOT");
//            } else if (randomInteger3 == b || randomInteger1 == b) {
//                System.out.println("WARM");
//            } else {
//                System.out.println("COLD");
//            }
//            // SPRAWDZENIE DLA TRZECIEJ CYFRY
//            if (randomInteger3 == c) {
//                System.out.println("HOT");
//            } else if (randomInteger2 == c || randomInteger1 == c) {
//                System.out.println("WARM");
//            } else {
//                System.out.println("COLD");
//            }
//           i++;
//            life--;
//        }
//
//        if (a == randomInteger1 && b == randomInteger2 && c == randomInteger3) {
//            System.out.println("CONGRATULATIONS! YOU WIN!");
//        } else {
//            System.out.println("You lose");
//        }
//    }
//}

/**
 * Boolean
 *
 */
public class App
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write real number?");
        Integer number = scanner.nextInt();

        boolean isnumberabovezero = number >= 0;
        boolean isnumberbelow9 = number <= 9;

        if(isnumberabovezero){
            if(isnumberbelow9){
                System.out.println("This is a digit");
            } else {
                System.out.println("This is not a digit.");
            }
        } else {
            System.out.println("This is not a digit.");
        }
    }
}