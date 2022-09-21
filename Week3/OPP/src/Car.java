public class Car { //Klasy rozpoczynamy z dużej litery
    int power; // typ pakietowy - on dziala jak publiczny w obrebie pakietu jak privet w obrebie pakietu
    private String name;
    private String colour;
    private static int numberOfWheels;

    public static String text = "Static field";// pole statyczne

    public Car(){ // konstruktor bezargumentowy (domyśny), aby nie wywalal bledu w mainie bo mamy tam okresloney Car() bez zmiennych w srodku
    }

//    Gdy nazwa arumentow w metodzie/konstrukotorze jest taka sama jak nazwa pola danej klasy
//    to nazwa argumentu ma priorytet, trzeba uzyc this albo innej nazwy, zeby nie wsywietlala null lub 0
//    Slowo kluczowe this wskazuje na obiekt, w ktorym danea metoda zostala wywolana
    public Car(String name, String colour, int numberOfWheel){
        this.name = name; // przypisujemy wartosci podane w argumenta do pol nowotworzonego obiektu
        this.colour = colour;
        numberOfWheels = numberOfWheel;
    }
// gettery
    public String getName(){

        return name;
    }

    public String getColour(){

        return colour;
    }

    public int getNumberOfWheels(){

        return numberOfWheels;
    }

//    settery
    public void setName(String name){

        this.name = name;
    }

    public void setColour(String colour){

        this.colour = colour;
    }

    public void setNumberOfWheels(int numberOfWheels){

        this.numberOfWheels = numberOfWheels;
    }

    public void printName(){
        System.out.println(name);
    }

    @Override
    public String toString(){
        return "Car{" + "name:" + name +
                ", colour:" + colour +
                ", numberOfWheels:" + numberOfWheels +
                "}";
    }
    //alt+insert skrot na dodawanie nowych metod

    public static void  printNuberOfWheels(){
        //w metodzie statycznej mamy dostep jedynie do pol i metod statycznych danej clasy
        System.out.println("Number of wheels" + numberOfWheels);

//        this.setName("abc"); - nie mozna sie odwolac bo metoda niestatyczna
    }
}
