package ru.lesson.lessions;

import ru.lesson.lessions.Interfaces.Input;
import ru.lesson.lessions.Interfaces.Output;

import java.util.Scanner;

public class InteractRunner{

    private final Input input;
    private final Output output;
    private final Calculator calculator;

    public InteractRunner(Input input, Output output, Calculator calculator) {
        this.input = input;
        this.output = output;
        this.calculator = calculator;
    }

    /**
     * Start calculator
     */
    public void action(){
                        do {
                            String first = input.ask("Enter first arg :");
                            String operation = input.ask("Enter operation : ");
                            String second = input.ask("Enter second arg :");
                            calculator.calculate(Double.valueOf(first),Double.valueOf(second),operation);
                            output.printLn(String.format("Result : %s",calculator.getResult()));
                            if ("yes".equals(input.ask("Do you whant to clean the result? yes/no"))){
                                calculator.clearResult();
                            }
                        }while ("no".equals(input.ask("Do you whant to continue? yes/no")));
        }

}
