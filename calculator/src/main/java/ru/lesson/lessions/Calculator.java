package ru.lesson.lessions;

import ru.lesson.lessions.Interfaces.Action;

import java.lang.Math;
import java.util.HashMap;
import java.util.Map;

/**
 * Calculation class
 */
public class Calculator{

    /**
     * Result of calculation
     */
    private double result;

    /**
     * Container of operations
     */
    private final Map<String, Action> operations = new HashMap<String, Action>();

    public Calculator(){
        this.load(new Add());
        this.load(new Subtraction());
        this.load(new Multiplication());
        this.load(new Division());
        this.load(new Involution());
    }

    /**
     * Load action class tothe map
     * @param action operation for load to the map
     */
    public void load(Action action){
        this.operations.put(action.operation(),action);
    }

    /**
     * Calculate result
     * @param first argument
     * @param second argument
     * @param operation
     */
    public void calculate(double first, double second, String operation){
        this.result = this.operations.get(operation).arithmetical(first,second);
    }

    /**
     * Get result
     * @return
     */
    public double getResult(){
        return this.result;
    }

    /**
     * Clear result
     */
    public void clearResult(){
        this.result = 0;
    }

    /**
     * Operation adding
     */
    public class Add implements Action {

        public String operation() {
            return "+";
        }

        public double arithmetical(double first, double second) {
            return first + second;
        }
    }

    /**
     * Operation Subtraction
     */
    public class Subtraction implements Action{

        public String operation() {
            return "-";
        }

        public double arithmetical(double first, double second) {
            return first - second;
        }
    }

    /**
     * Opration Multiplication
     */
    public class Multiplication implements Action{

        public String operation() {
            return "*";
        }

        public double arithmetical(double first, double second) {
            return first * second;
        }
    }

    /**
     * Operation Division
     */
    public class Division implements Action{

        public String operation() {
            return "/";
        }

        public double arithmetical(double first, double second) {
            if (second == 0){
                throw new ArithmeticException();
            }
            return first/second;
        }
    }

    /**
     * Operation Involution
     */
    public class Involution implements Action{

        public String operation() {
            return "inv";
        }

        public double arithmetical(double first, double second) {
            return Math.pow(first, second);
        }
    }
}
