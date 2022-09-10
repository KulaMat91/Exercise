public class Zad1 {

    public static void main( String[] args ) {


        Person person1 = new Person("Jan", "Kowalski", 18);
        Person person2 = new Person("Kate", "Smith", 25);

        System.out.println(person1);
        System.out.println(person2);
        person1.setAge(19);
        person2.setSurname("Nowak");
        System.out.println(person1);
        System.out.println(person2);


    }

}
