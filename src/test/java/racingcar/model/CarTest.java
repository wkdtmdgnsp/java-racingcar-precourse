package racingcar.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void 이동_테스트() {
        Car car = new Car("popi");
        car.move(5);
        assertThat(car.getPosition()).isEqualTo(1);
    }
}