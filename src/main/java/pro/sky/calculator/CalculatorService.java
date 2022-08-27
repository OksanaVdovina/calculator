package pro.sky.calculator;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CalculatorService {
    public String answerHello() {
        return "Добро пожаловать в калькулятор.";
    }

    public Number sumOfNumbers(Integer number1, Integer number2) {
        int result = number1 + number2;
            return result;
        }

    public Number subtraction(Integer number1, Integer number2) {
        int result = number1 - number2;
            return result;
        }

    public Number multiply(Integer number1, Integer number2) {
        int result = number1 * number2;
            return result;
        }

    public Number division(Integer number1, Integer number2) throws IllegalArgumentException {
        if (number2 == 0) {
            throw new IllegalArgumentException("Делить на 0 нельзя!");
        } else {
            double result = number1.doubleValue()/number2.doubleValue();
            return result;
        }
    }
}
