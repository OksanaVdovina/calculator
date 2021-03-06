package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String answerHello() {
        return calculatorService.answerHello();
    }

    @GetMapping(path = "/calculator/plus")
    public String sumOfNumbers(@RequestParam(required = false, name = "num1") Integer number1, @RequestParam(required = false, name = "num2") Integer number2) {
        return calculatorService.sumOfNumbers(number1, number2);
    }

    @GetMapping(path = "/calculator/minus")
    public String subtraction(@RequestParam(required = false, name = "num1") Integer number1, @RequestParam(required = false, name = "num2") Integer number2) {
        return calculatorService.subtraction(number1, number2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam(required = false, name = "num1") Integer number1, @RequestParam(required = false, name = "num2") Integer number2) {
        return calculatorService.multiply(number1, number2);
    }

    @GetMapping(path = "/calculator/divide")
    public String division(@RequestParam(required = false, name = "num1") Integer number1, @RequestParam(required = false, name = "num2") Integer number2) {
        return calculatorService.division(number1, number2);
    }

}
