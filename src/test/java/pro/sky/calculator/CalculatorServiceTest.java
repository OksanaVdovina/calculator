package pro.sky.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plusTest() {
        Number actual = calculatorService.sumOfNumbers(2,3);
        Assertions.assertThat(actual).isEqualTo(5);

        actual = calculatorService.sumOfNumbers(-3,1);
        Assertions.assertThat(actual).isEqualTo(-2);
    }

    @Test
    public void minusTest() {
        Number actual = calculatorService.subtraction(2,3);
        Assertions.assertThat(actual).isEqualTo(-1);

        actual = calculatorService.subtraction(-3,1);
        Assertions.assertThat(actual).isEqualTo(-4);
    }

    @Test
    public void multiplyTest() {
        Number actual = calculatorService.multiply(2,3);
        Assertions.assertThat(actual).isEqualTo(6);

        actual = calculatorService.multiply(-3,1);
        Assertions.assertThat(actual).isEqualTo(-3);
    }

    @Test
    public void divisionPositiveTest() {
        Number actual = calculatorService.division(1,2);
        Assertions.assertThat(actual).isEqualTo(0.5);

        actual = calculatorService.division(-3,1);
        Assertions.assertThat(actual).isEqualTo(-3.0);
    }

    @Test
    public void divisionNegativeTest() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()-> calculatorService.division(-1,0))
                .withMessage("Делить на 0 нельзя!");

        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()-> calculatorService.division(1,0))
                .withMessage("Делить на 0 нельзя!");
    }
}
