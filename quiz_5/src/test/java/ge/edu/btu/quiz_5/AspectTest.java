package ge.edu.btu.quiz_5;

import ge.edu.btu.quiz_5.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class AspectTest {

    @Autowired
    CalculatorService calculatorService;

    @Test
    void PrintlnTest() {
        Assertions.assertEquals(50, calculatorService.multiple(10, 5));
    }

}
