package patterns.creational.builderpattern.test;

import patterns.creational.builderpattern.builder.CarBuilder;
import patterns.creational.builderpattern.builder.CarManualBuilder;
import patterns.creational.builderpattern.builder.CarNormalBuilder;
import patterns.creational.builderpattern.director.CarDirector;
import patterns.creational.builderpattern.product.Car;
import patterns.creational.builderpattern.product.CarManual;

public class CarClientTest {

    public static void main(String[] args) {
        CarDirector director = new CarDirector();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarNormalBuilder builder = new CarNormalBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        CarManual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
