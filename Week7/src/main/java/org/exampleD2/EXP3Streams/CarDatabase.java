package org.exampleD2.EXP3Streams;

import java.util.*;
import java.util.stream.Collectors;

public class CarDatabase {
    private final Set<Car> cars;

    public CarDatabase(Set<Car> cars) {
        this.cars = cars;
    }


    //1.Get all cars
    public Set<Car> getAkkCars() {
        return new HashSet<>();
    }

    //2. Get all cars from given year

    public Set<Car> getAllCarsFromYear(Integer year) {

//        HashSet<Car> resultCars = new HashSet<>();
//        for (Car car : cars){
//            if (car.getYearProduced().equals(year)){
//                resultCars.add(car);
//            }
//        }
//        return  resultCars;

        return cars.stream().filter(car -> car.getYearProduced().equals(year)).collect(Collectors.toSet());
        //stream trzeba colletionowac do seta

    }

    //3. Get all cars of given engine type
    public Set<Car> getAllCarsWithGivenEngineType(Car.EngineType engineType) {
             /*
        HashSet<Car> resultCars = new HashSet<>();
        for (Car car : cars) {
            if (car.getEngineType().equals(engineType)) {
                resultCars.add(car);
            }
        }
        return resultCars;
        */
        return cars.stream().filter(car -> car.getEngineType().equals(engineType)).collect(Collectors.toSet());
    }

    //4. Get all cars from given brand

    public Set<Car> getAllCarsFromGivenBrand(String brand) {

//        HashSet<Car> resultBrand = new HashSet<>();
//        for (Car car : cars) {
//            if (car.getBrand().equals(brand)) {
//                resultBrand.add(car);
//            }
//        }
//        return resultBrand;
        // kolekcja na której bazuje nasz stream.przerabiamy na stream.funckja filtrujemy
        // .(car)-pojedynczy element (zwraca wartość true/false).może dodać kolejną funkcję
        // lub zwrócić ponownie do kolekcji tak jak w tym przypadku
        return cars.stream().filter(car -> car.getBrand().equals(brand)).collect(Collectors.toSet());
    }

    // 5. Get all cars from given year, given engine type and given brand

    public Set<Car> getAllCarsWithGivenYearEngineTypeAndBrand(Integer year, Car.EngineType engineType, String brand) {
        return cars.stream()
                .filter(car -> car.getYearProduced().equals(year))
                .filter(car -> car.getBrand().equals(brand))
                .filter(car -> car.getEngineType().equals(engineType))
                .collect(Collectors.toSet());
    }

    // 6. Get cheapest car

    public Optional<Car> getCheapestCar() {
        return cars.stream().min(Comparator.comparing(Car::getPrice));
//        return  cars.stream().min((a,b) -> a.getPrice().compareTo(b.getPrice()));
    }

    // 7. Get most expensive car from given year
    public Optional<Car> getMostExpensiveCarFromGivenYear(Integer year) {
        return cars.stream()
                .filter(car -> car.getYearProduced().equals(year))
                .max(Comparator.comparing(Car::getPrice));
    }

    // 8. Get most powerful car with given engine type and given brand
    public Optional<Car> getMostMostPowerfulCarWithGivenEngineTypeAndBrand(Car.EngineType engineType, String brand) {
        return cars.stream()
                .filter(car -> car.getEngineType().equals(engineType))
                .filter(car -> car.getBrand().equals(brand))
                .max(Comparator.comparing(Car::getHorsePower));
    }


    // 9. Get average price of a car from given year
    public Double getAveragePriceOfCarFromGivenYear(Integer year) {
        return cars.stream()
                .filter(car -> car.getYearProduced().equals(year))
                .collect(Collectors.averagingInt(Car::getPrice));
//                .collect(Collectors.averagingInt(car -> car.getPrice()));
    }


    // 10. Get maximum horsepower for each engine type of all cars from given year
        public Map<Car.EngineType, Set<Car>> groupCarsPerEngineType(){
        return Arrays.stream(Car.EngineType.values())
                .collect(Collectors.toMap(engineType -> engineType,
                        engineType -> cars.stream().filter(car -> car.getEngineType()
                                .equals(engineType)).collect(Collectors.toSet())));
        }

//    public Map<Car.EngineType,Integer> getMaxHorsePowerFromEachEngineType(){
//        return Arrays.stream(Car.EngineType.values())
//                .collect(Collectors.toMap(engineType -> engineType,
//                        engineType -> cars.stream().filter(car -> car.getEngineType()
//                                .equals(engineType)).max(Comparator.comparing(Car :: getHorsePower)).));
//    }

}
