package ru.lesson.lessions;

import java.lang.Math;

public class Calculate{
        
        public static void main(String[] args) {
                System.out.println("Calculate...");
                Double first = Double.valueOf(args[0]);
                Double second = Double.valueOf(args[1]);
                System.out.println("Sum is " + (first + second));
                System.out.println("Difference is " + (first - second));
                System.out.println("Composition is " + (first * second));
                System.out.println("Division is " + (first / second));
                System.out.println("Involution is " + (Math.pow(first, second)));
        }
}
