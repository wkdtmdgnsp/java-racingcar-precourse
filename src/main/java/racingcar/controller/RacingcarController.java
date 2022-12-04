package racingcar.controller;

import racingcar.model.CarGame;
import racingcar.view.InputView;

import java.util.List;

public class RacingcarController {
    private InputView inputView = new InputView();
    private CarGame carGame = new CarGame();

    public void run() {
        inputCarName();
    }

    public void inputCarName() {
        try {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            List<String> carNames = inputView.readCarName();
            carGame.cars(carNames);
        } catch (IllegalArgumentException e) {
            inputCarName();
        }
    }

    public void inputGameCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        inputView.readGameCount();
    }
}
