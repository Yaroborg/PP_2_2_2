package web.model;
import java.util.Objects;
public class Car {

    private String model;
    private int horsePower;
    private String color;
    public Car(){

    }

    public Car(String model, int horsePower, String color) {
        this.model = model;
        this.horsePower = horsePower;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return horsePower == car.horsePower && model.equals(car.model) && color.equals(car.color);
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash = 31 * hash + model.hashCode();
        hash = 31 * hash + horsePower;
        hash = 31 * hash + color.hashCode();
        return hash;
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", color='" + color + '\'' +
                '}';
    }
}
