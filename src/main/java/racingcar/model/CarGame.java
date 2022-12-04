package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class CarGame {
    private List<Car> cars = new ArrayList<>();

    public void cars(List<String> carNames) {
        for (int i=0; i<carNames.size(); i++) {
            Car car = new Car(carNames.get(i));
            cars.add(car);
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public void carGame(int gameCount) {

    }
}
