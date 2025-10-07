import java.util.List;

public class CarService {
    private final Car car = new LinkedStack<>();
    
    public void addCar(Car car) {
        car.push(car);
        System.out.println("Carro adicionado: " + car);
    }

    public Car removeCar() {
        Car removed = car.pop();
        if (removed != null)
            System.out.println("Carro removido: " + removed);
        else
            System.out.println("Nenhum carro no estacionamento.");
        return removed;
    }

    public void showCars() {
        List<Car> cars = car.update();
        if (cars.isEmpty()) {
            System.out.println("Estacionamento vazio.");
        } else {
            System.out.println("Carros no estacionamento:");
            cars.forEach(System.out::println);
        }
    }
}