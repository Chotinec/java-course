package ru.lesson.lessions;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import ru.lesson.lessions.Interfaces.Input;
import ru.lesson.lessions.Interfaces.Output;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by art on 11.05.16.
 */
public class InteractRunnerTest {

    @Test
    public void testAction() throws Exception {
        //assign
        final Output out = new OutputStub();
        final Input in = new InputStub(Arrays.asList("1", "+", "1", "no", "yes").iterator(),out);
        final Calculator calculator = new Calculator();
        final InteractRunner runner = new InteractRunner(in,out,calculator);
        //action
        runner.action();
        in.close();
        //assert
        assertEquals(2,calculator.getResult(),0);
    }
}