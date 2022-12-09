package patterns.creational.builderpattern.builder;

import patterns.creational.builderpattern.components.*;

/**
 *  Builder interface defines all possible ways to configure a product.
 */
public interface CarBuilder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
