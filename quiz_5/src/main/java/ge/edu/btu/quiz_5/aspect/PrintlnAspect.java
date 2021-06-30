package ge.edu.btu.quiz_5.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class PrintlnAspect {

    @Before("@annotation(ge.edu.btu.quiz_5.aspect.Println)")
    public void printAnnotationAspect(JoinPoint joinPoint) {
        System.out.println("Arguments: " + Arrays.toString(joinPoint.getArgs()));
    }

}
