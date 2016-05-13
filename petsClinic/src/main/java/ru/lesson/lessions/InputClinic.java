package ru.lesson.lessions;

import ru.lesson.lessions.Interfaces.Input;
import ru.lesson.lessions.Interfaces.Output;

import java.util.Scanner;

/**
 * Created by art on 12.05.16.
 */
public class InputClinic implements Input {

    private final Output output = new OutputClinic();
    private Scanner in = new Scanner(System.in);

    @Override
    public String next() {
        return in.next();
    }

    @Override
    public String ask(String question) {
        output.printLn(question);
        return in.next();
    }

    @Override
    public void close() {
        in.close();
    }
}
