package pro.sky.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParameterizedCalculatorTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("ParamsForSumOfNumbers")
    public void sumOfNumbersTest(Integer a,Integer b, Integer result) {
        Assertions.assertThat(calculatorService.sumOfNumbers(a,b)).isEqualTo(result);
    }

    @ParameterizedTest
    @MethodSource("ParamsForSubtraction")
    public void subtractionTest(Integer a,Integer b, Integer result) {
        Assertions.assertThat(calculatorService.subtraction(a,b)).isEqualTo(result);
    }

    @ParameterizedTest
    @MethodSource("ParamsForMultiply")
    public void multiplyTest(Integer a,Integer b, Integer result) {
        Assertions.assertThat(calculatorService.multiply(a,b)).isEqualTo(result);
    }

    @ParameterizedTest
    @MethodSource("ParamsForDivision")
    public void divisionTest(Integer a,Integer b, Double result) {
        Assertions.assertThat(calculatorService.division(a,b)).isEqualTo(result);
    }

    public static Stream<Arguments> ParamsForSumOfNumbers() {
        return Stream.of(
                Arguments.of(1,2,3),
                Arguments.of(-1,2,1),
                Arguments.of(-10,-6,-16),
                Arguments.of(1,-5,-4),
                Arguments.of(0,0,0)
        );
    }

    public static Stream<Arguments> ParamsForSubtraction() {
        return Stream.of(
                Arguments.of(1,2,-1),
                Arguments.of(-1,2,-3),
                Arguments.of(-10,-6,-4),
                Arguments.of(1,-5,6),
                Arguments.of(0,0,0)
        );
    }

    public static Stream<Arguments> ParamsForMultiply() {
        return Stream.of(
                Arguments.of(1,2,2),
                Arguments.of(-1,2,-2),
                Arguments.of(-10,-6,60),
                Arguments.of(1,-5,-5),
                Arguments.of(0,0,0)
        );
    }

    public static Stream<Arguments> ParamsForDivision() {
        return Stream.of(
                Arguments.of(1,2,0.5),
                Arguments.of(-1,2,-0.5),
                Arguments.of(-10,-2,5.0),
                Arguments.of(1,-5,-0.2)
        );
    }

}
