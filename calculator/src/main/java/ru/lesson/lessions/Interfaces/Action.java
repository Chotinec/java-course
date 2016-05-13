package ru.lesson.lessions.Interfaces;

/**
 * Created by art on 11.05.16.
 */
public interface Action {

    /**
     * Get operation
     * @return operation
     */
    String operation();

    /**
     * Get result of this operation
     * @param first argument1
     * @param second argument2
     * @return result of this operation
     */
    double arithmetical(double first, double second);
}
