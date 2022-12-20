package devices;

import java.util.Objects;

public class Car {

    public final String producer;
    public final String model;
    public Double mileage;
    public Integer horsepower;
    public String color;
    public String gearbox;
    public String fuelType;
    public Double value;


    public Car(String producer, String model, Double mileage, Integer horsepower, String color, String gearbox, String fuelType, Double value) {
        this.producer = producer;
        this.model = model;
        this.mileage = mileage;
        this.horsepower = horsepower;
        this.color = color;
        this.gearbox = gearbox;
        this.fuelType = fuelType;
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(producer, car.producer) &&
                Objects.equals(model, car.model) &&
                Objects.equals(mileage, car.mileage) &&
                Objects.equals(horsepower, car.horsepower) &&
                Objects.equals(color, car.color) &&
                Objects.equals(gearbox, car.gearbox) &&
                Objects.equals(fuelType, car.fuelType) &&
                Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, mileage, horsepower, color, gearbox, fuelType, value);
    }

    @Override
    public String toString() {
        return "devices.Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", horsepower=" + horsepower +
                ", color='" + color + '\'' +
                ", gearbox='" + gearbox + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", value=" + value +
                '}';
    }
}
