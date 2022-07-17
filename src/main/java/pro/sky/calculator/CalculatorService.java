package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String answerHello() {
        return "Добро пожаловать в калькулятор.";
    }

    public String sumOfNumbers(int number1, int number2) {
        int result = number1 + number2;
        return number1 + " + " + number2 + " = " + result;
    }

    public String subtraction(int number1, int number2) {
        int result = number1 - number2;
        return number1 + " - " + number2 + " = " + result;
    }

    public String multiply(int number1, int number2) {
        int result = number1 * number2;
        return number1 + " * " + number2 + " = " + result;
    }

    public String division(int number1, int number2) {
        int result = number1 / number2;
        return number1 + " / " + number2 + " = " + result;
    }

}
