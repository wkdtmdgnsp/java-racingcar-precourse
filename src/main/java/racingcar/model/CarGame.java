package racingcar.model;

import racingcar.util.RandomNumber;
import racingcar.view.OutputView;

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
        OutputView outputView = new OutputView();
        System.out.println("실행 결과");
        for (int i=0; i<gameCount; i++) {
            racing();
            outputView.printGame(this);
        }
    }

    private void racing() {
        RandomNumber randomNumber = new RandomNumber();
        for (int i=0; i<cars.size(); i++) {
            int number = randomNumber.randomNumber();
            cars.get(i).move(number);
        }
    }
}
