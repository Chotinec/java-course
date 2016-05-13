package ru.lesson.lessions;

import ru.lesson.lessions.Interfaces.Output;

/**
 * Created by art on 11.05.16.
 */
public class OutputStub implements Output {

    public void printLn(String line) {
        System.out.println(line);
    }
}
