import org.junit.Test;
import static org.junit.Assert.*;

/**
        Еестируем калькулятор
*/
public class CalculatorTest{

        /**
                Проверяем сложение двух чисел
        */
        @Test
        public void addsTwoParams(){
                Calculator calculator = new Calculator();
                calculator.add(1.0,1.0);
                assertEquals(2.0,calculator.getResult());
        }

         /**
                Проверяем вычитание двух чисел
        */
        @Test
        public void subtractsTwoParams(){
                Calculator calculator = new Calculator();
                calculator.subtract(2.0,1.0);
                assertEquals(1.0,calculator.getResult());
        }

        /**
                Проверяем умножение двух чисел
        */
        @Test
        public void multiplicationsTwoParams(){
                Calculator calculator = new Calculator();
                calculator.multiplication(2.0,1.0);
                assertEquals(2.0,calculator.getResult());
        }

         /**
                Проверяем деление двух чисел
        */
        @Test
        public void divisionsTwoParams(){
                Calculator calculator = new Calculator();
                calculator.division(4.0,2.0);
                assertEquals(2.0,calculator.getResult());
        }

        /**
                Проверяем возведение в степень
        */
        @Test
        public void involutionsTwoParams(){
                Calculator calculator = new Calculator();
                calculator.involution(2.0,2.0);
                assertEquals(4.0,calculator.getResult());
        }
        
}
