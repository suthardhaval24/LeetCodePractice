package com.designPatterns.factoryPattern;

/**
 * Factory pattern is most suitable where there is some complex object creation steps are involved. To ensure that these steps are centralized and not exposed to composing classes, factory pattern should be used. We can see many realtime examples of factory pattern in JDK itself e.g.
 * <p>
 * java.sql.DriverManager#getConnection()
 * java.net.URL#openConnection()
 * java.lang.Class#newInstance()
 * java.lang.Class#forName()
 */


public class CarFactory {

    private CarFactory() {
    }

    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SMALL:
                car = new SmallCar();
                break;

            case SEDAN:
                car = new SedanCar();
                break;

            case LUXURY:
                car = new LuxuryCar();
                break;

            default:
                // throw some exception
                break;
        }
        return car;
    }
}
