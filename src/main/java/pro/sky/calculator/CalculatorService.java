package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String answerHello() {
        return "Добро пожаловать в калькулятор.";
    }

    public String sumOfNumbers(Integer number1, Integer number2) {
        if (number1 == null && number2 != null) {
            return "Параметр num1 не задан";
        } else if (number1 != null && number2 == null) {
            return "Параметр num2 не задан";
        } else if (number1 == null && number2 == null) {
            return "Параметры num1 и num2 не заданы";
        } else {
            int result = number1 + number2;
            return number1 + " + " + number2 + " = " + result;
        }
    }

    public String subtraction(Integer number1, Integer number2) {
        if (number1 == null && number2 != null) {
            return "Параметр num1 не задан";
        } else if (number1 != null && number2 == null) {
            return "Параметр num2 не задан";
        } else if (number1 == null && number2 == null) {
            return "Параметры num1 и num2 не заданы";
        } else {
            int result = number1 - number2;
            return number1 + " - " + number2 + " = " + result;
        }
    }

    public String multiply(Integer number1, Integer number2) {
        if (number1 == null && number2 != null) {
            return "Параметр num1 не задан";
        } else if (number1 != null && number2 == null) {
            return "Параметр num2 не задан";
        } else if (number1 == null && number2 == null) {
            return "Параметры num1 и num2 не заданы";
        } else {
            int result = number1 * number2;
            return number1 + " * " + number2 + " = " + result;
        }
    }

    public String division(Integer number1, Integer number2) {
        if (number1 == null && number2 != null) {
            return "Параметр num1 не задан";
        } else if (number1 != null && number2 == null) {
            return "Параметр num2 не задан";
        } else if (number1 == null && number2 == null) {
            return "Параметры num1 и num2 не заданы";
        } else if (number2 == 0) {
            return "На 0 делить нельзя";
        } else {
            int result = number1 / number2;
            return number1 + " / " + number2 + " = " + result;
        }
    }
}
