package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.util.UserException;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    private UserException userException = new UserException();

    public List<String> readCarName() {
        String carNames [] = Console.readLine().split(",");
        List<String> cars = new ArrayList<>();
        for (int i=0; i<carNames.length; i++) {
            cars.add(carNames[i]);
        }
        try {
            userException.carNameException(cars);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
        return cars;
    }

    public int readGameCount() {
        try {
            String count = Console.readLine();
            int gameCount = userException.gameCountException(count);
            return gameCount;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }
}
