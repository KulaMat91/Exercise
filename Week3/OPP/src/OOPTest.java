public class OOPTest {
    public static void main( String[] args ) {

        Car car1 = new Car();// tworzymy nowy obiekt typu Car <==> tworzymy instancję klasy Car
        Car car2 = new Car();
        // poniższa liniejka nie kopiuje obiektu tylko kopiuje referencje
        Car car3 = car1; // tworze nowy obiekt przypisujac do niego car1

        //po kropce mamy dostep do pól oraz metod danego obiektu
//        car1.name = "CarAuto"; //przypisujemy nazwe obiektu car1 jako CarAuto
        car1.setName("CarAuto");
        //car1.numberOfWheels = 4; // gdy nie zadamy wartosci wyswietli 0 lub null
        car1.printName(); // wywolujemy metode printName na obiekcie car1
        // jaka bedzie wartosc numberOfWheels
//        System.out.println(car1.numberOfWheels); // typ prymitywny nie byl przez nas inicjonowany
//        System.out.println(car1.colour);//typ referencyjny - co wyswietli po inicjalizaci
        System.out.println(car1.getNumberOfWheels());
        System.out.println(car1.getColour());
        car3.printName();

        System.out.println();

// Inicjalizacja car 4 nastepuje w konstruktorze w ktorym utworzylismy
        Car car4 = new Car("Audi", "Red", 4);
        System.out.println("car 4:");
        car4.printName();
        System.out.println(car4.getName());
        System.out.println(car4.getColour());
        System.out.println(car4.getNumberOfWheels());

        System.out.println(car4);//sprawdzc czy to jest hascode czy w nazwie pamieci jezeli nie przypisze toString
//czyli zwracana jest nazwa klasy + @ + heksadecymalna reprezentacja hash code, np. PhoneNumber@163b91.

//        STATIC NON-STATCI
        System.out.println("Static non-static");
        Car.printNuberOfWheels();//metody statyczne mozna uzywac na klasie i obiekcie
        car1.printNuberOfWheels();
        System.out.println(Car.text);//pola statyczne mozna uzywac na klasie i obiekcie
        System.out.println(car1.text);

        System.out.println();

//        pola statyczne są wspóldzielone w obrebie danej clasy.
//        To oznacza jesli wartosc pola statyznego zostanie zmieniona w obrebie danego obiektu lub clasy
//        to ta wartosc ulegnie zmianie takze we wszystkich pozostalych obiektach danej clasy
        Car.text = "Diffrent static text";
        System.out.println(Car.text);
        System.out.println(car1.text);
        System.out.println(car2.text);

    }
}
