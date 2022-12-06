package racingcar.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RandomNumberTest {

    @Test
    void 랜덤_숫자_테스트() {
        RandomNumber randomNumber = new RandomNumber();
        int number = randomNumber.randomNumber();
        boolean range = false;
        if (number > 0 && number < 10) {
            range = true;
        }
        assertThat(range).isEqualTo(true);
    }
}