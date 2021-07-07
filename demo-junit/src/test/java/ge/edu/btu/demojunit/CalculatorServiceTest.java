package ge.edu.btu.demojunit;

import ge.edu.btu.demojunit.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class CalculatorServiceTest {

    @Autowired
    CalculatorService calculatorService;

    @Test
    void addition() {
        assertEquals(10, calculatorService.addition(5, 5));
    }

    @Test
    void subtraction() {
        assertEquals(10, calculatorService.subtraction(15, 5));
    }

    @Test
    void multiplication() {
        assertEquals(10, calculatorService.multiplication(2, 5));
    }

    @Test
    void division() {
        assertEquals(10f, calculatorService.division(20, 2));
    }

}
