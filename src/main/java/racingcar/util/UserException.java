package racingcar.util;

import java.util.List;

public class UserException {
    public void carNameException(List<String> cars) {
        for (int i=0; i<cars.size(); i++) {
            if (cars.get(i).length() > 5) {
                System.out.println("[ERROR] 자동차 이름은 5자 이하로 입력 해주세요.");
                throw new IllegalArgumentException();
            }
        }
    }

    public int gameCountException(String count) {
        try {
            int gameCount = Integer.parseInt(count);
            return gameCount;
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
            throw new IllegalArgumentException();
        }
    }
}
