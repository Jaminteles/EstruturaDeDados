import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Car {
    private String licensePlate;
    private String make;
    private String model;
    private String color;
    private String ownerName;
    private LocalDateTime arrived;

    public Car(String licensePlate, String make, String model) {
        if (licensePlate == null || make == null || model == null) {
            throw new NoSuchElementException("licensePlate, make e model são obrigatórios!");
        }
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.arrived = LocalDateTime.now();
    }

    public LocalDateTime getArrived() {
        return arrived;
    }

    public String getColor() {
        return color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setArrived(LocalDateTime arrived) {
        this.arrived = arrived;
    }

    @Override
    public String toString() {
        return "Car{" + 
                "licensePlate='" + licensePlate + '\'' +
                ", make='" + make + '\'' + 
                ", model='" + '\'' +
                ", color='" + '\'' +
                ", ownerName='" + '\'' +
                ", arrived='" + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        
        if (!(o instanceof Car)) {
            return false;
        }
        
        Car car = (Car) o;
        return licensePlate.equals(car.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate);
    }
}
