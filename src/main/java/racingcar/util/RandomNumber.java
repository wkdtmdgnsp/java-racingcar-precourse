package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {
    public int randomNumber() {
        int number = Randoms.pickNumberInRange(1,9);
        return number;
    }
}
