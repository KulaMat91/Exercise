package org.exampleD2.EXP3Streams;

public class Car {
    public enum EngineType{
        Gasoline,
        Disel,
        Hybrid,
        Electric
    }
    private final String brand;
    private final String model;
    private final Integer yearProduced;
    private final Integer horsePower;
    private final  Integer price;
    private final EngineType engineType;

    public Car(String brand, String model, Integer yearProduced, Integer horsePower, Integer price, EngineType engineType) {
        this.brand = brand;
        this.model = model;
        this.yearProduced = yearProduced;
        this.horsePower = horsePower;
        this.price = price;
        this.engineType = engineType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYearProduced() {
        return yearProduced;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearProduced=" + yearProduced +
                ", horsePower=" + horsePower +
                ", price=" + price +
                ", engineType=" + engineType +
                '}';
    }
}
