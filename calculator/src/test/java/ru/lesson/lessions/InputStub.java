package ru.lesson.lessions;

import ru.lesson.lessions.Interfaces.Input;
import ru.lesson.lessions.Interfaces.Output;

import java.util.Iterator;

/**
 * Created by art on 11.05.16.
 * Realisation input interface
 */
public class InputStub implements Input {

    private final Iterator<String> answer;
    private final Output output;

    public InputStub(Iterator<String> answer, Output output) {
        this.answer = answer;
        this.output = output;
    }

    public String next() {
        return this.answer.next();
    }

    public String ask(String question) {
        this.output.printLn(question);
        return this.answer.next();
    }

    public void close() {

    }
}
