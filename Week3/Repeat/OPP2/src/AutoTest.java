public class AutoTest {
    public static void main(String[] args) {
        Auto auto1 = new Auto("BMW","Combi", "Black", 200);
        System.out.println(auto1.getName());
        System.out.println(auto1);
        auto1.setColor("Orange");
        auto1.setKmPower(125);
        System.out.println(auto1);
        String autoString = auto1.toString();
        System.out.println(autoString);
        Auto.printColor();

        Auto auto3 = new Auto("Porsche", "Sport", "Lemon", 250);
        System.out.println(auto3);
        auto3.setModel("Cabrio");
        System.out.println(auto3);
        Auto.printColor();

    }
}
