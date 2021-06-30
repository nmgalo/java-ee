package ge.edu.btu.quiz_5.service.impl;

import ge.edu.btu.quiz_5.aspect.Println;
import ge.edu.btu.quiz_5.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Println
    @Override
    public int multiple(int x, int y) {
        return x * y;
    }

}
