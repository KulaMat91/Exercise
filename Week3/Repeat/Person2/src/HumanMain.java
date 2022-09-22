public class HumanMain {
    public static void main(String[] args) {

        Human human1 = new Human("Mariusz", 195 , 120 , 35);
        Human human2 = new Human("Dariusz", 175 , 80 , 45);
        System.out.println(human1);
        System.out.println(human2);

        human1.setAge(65);
        human1.setHeight(195.4);
        human1.setWeight(123.4);

        human2.setAge(25);
        human2.setName("PUDZIAN");
        human2.setWeight(123);
        human2.setHeight(199);
        System.out.println(human1.getAge());

        System.out.println(human1);
        System.out.println(human2);

    }
}
