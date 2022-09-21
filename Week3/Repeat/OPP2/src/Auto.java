public class Auto {
    private String name;
    private String model;
    private static String color;
    private int kmPower;

    public Auto() {

    }

    public Auto(String name, String model, String colors, int kmPower) {
        this.name = name;
        this.model = model;
        this.kmPower = kmPower;
        color = colors;
    }

    public String getName() {
        return name;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getKmPower() {
        return kmPower;
    }

    public void setName(String name ){
        this.name = name;
    }

    public void setColor(String color) {
        Auto.color = color;
    }
    public void setModel(String model){
        this.model = model;
    }
    public  void setKmPower(int kmPower){
        this.kmPower = kmPower;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name = '" + name + '\'' +
                ", model = '" + model + '\'' +
                ", color = " + color + '\'' +
                ", kmPower = " + kmPower +
                '}';
    }

    public static void  printColor(){
        System.out.println("Color: " + color);
    }
}
