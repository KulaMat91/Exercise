public class Human {
    private String name;
    private double height;
    private double weight;
    private int age;

    public Human() {
    }

    public Human(String name, double height, double weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    //GETTERT
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    //SETTERY
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //TO STRING
    public String toString() {
        return "Human{ name = " + name + ", height = " + height + ", weight = " + weight + ", age = " + age + " }";
    }


}
