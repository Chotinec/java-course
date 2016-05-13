package ru.lesson.lessions;

import ru.lesson.lessions.Interfaces.Output;

/**
 * Created by art on 12.05.16.
 */
public class OutputClinic implements Output {
    @Override
    public void printLn(String line) {
        System.out.println(line);
    }
}
