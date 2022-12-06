package racingcar.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarGameTest {

    @Test
    void 자동차_저장_테스트() {
        CarGame carGame = new CarGame();
        carGame.cars(Arrays.asList("a","b"));
        assertThat(carGame.getCars().size()).isEqualTo(2);
    }

    @Test
    void carGame() {
    }
}