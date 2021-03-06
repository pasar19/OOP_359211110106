package ooplab9;

public class Car {
    private String brand;
    private String color;
    private Engine engine; // has-a relation
    //toString

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    //getter and setter method

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    //constructor


    public Car(String brand, String color, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
    }
}//class
© 2018 GitHub, Inc.