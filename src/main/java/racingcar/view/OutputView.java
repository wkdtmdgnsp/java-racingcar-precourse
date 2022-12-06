package racingcar.view;

import racingcar.model.Car;
import racingcar.model.CarGame;

import java.util.List;

public class OutputView {
    public void printGame(CarGame carGame) {
        List<Car> cars = carGame.getCars();
        for (int i=0; i<cars.size(); i++) {
            System.out.print(cars.get(i).getName() +" : ");
            for (int j=0; j<cars.get(i).getPosition(); j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printResult(List<String> bestCar) {
        String best = String.join(",", bestCar);
        System.out.print("최종 우승자 : " +best);
    }
}
