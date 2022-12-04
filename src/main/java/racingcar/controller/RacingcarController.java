package racingcar.controller;

import racingcar.view.InputView;

public class RacingcarController {
    InputView inputView = new InputView();
    public void run() {
        inputCarName();
    }

    public void inputCarName() {
        try {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            inputView.readCarName();
        } catch (IllegalArgumentException e) {
            inputCarName();
        }
    }
}
