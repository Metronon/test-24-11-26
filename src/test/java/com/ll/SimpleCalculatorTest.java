package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("1 + 2 = 3")
    public void t1() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(1, 2);

        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName("2 + 10 = 12")
    public void t2() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(2, 10);

        assertThat(rs).isEqualTo(12);
    }

    @Test
    @DisplayName("20 + 10 = 30")
    public void t3() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(20, 10);

        assertThat(rs).isEqualTo(30);
    }

    @Test
    @DisplayName("2 * 6 = 12")
    public void t4() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.multiply(2, 6);

        assertThat(rs).isEqualTo(12);
    }

    @Test
    @DisplayName("5 * 4 = 20")
    public void t5() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.multiply(5, 4);

        assertThat(rs).isEqualTo(20);
    }

    @Test
    @DisplayName("9 * 7 = 63")
    public void t6() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.multiply(9, 7);

        assertThat(rs).isEqualTo(63);
    }

    @Test
    @DisplayName("7 - 6 = 1")
    public void t7() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.minus(7, 6);

        assertThat(rs).isEqualTo(1);
    }

    @Test
    @DisplayName("15 - 13 = 2")
    public void t8() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.minus(15, 13);

        assertThat(rs).isEqualTo(2);
    }

    @Test
    @DisplayName("50 - 20 = 30")
    public void t9() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.minus(50, 20);

        assertThat(rs).isEqualTo(30);
    }

    @Test
    @DisplayName("15 / 3 = 5")
    public void t10() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.divide(15, 3);

        assertThat(rs).isEqualTo(5);
    }

    @Test
    @DisplayName("20 / 6 = 3")
    public void t11() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.divide(20, 6);

        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName("24 / 4 = 6")
    public void t12() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.divide(24, 4);

        assertThat(rs).isEqualTo(6);
    }
}