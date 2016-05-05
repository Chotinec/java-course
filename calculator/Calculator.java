import java.lang.Math;

/**
        Класс реализующий операции сложения, вычитания, умножения, деления, возведения в степень
*/
public class Calculator{
       
        /**
                Результат Вычислений
        */
        private double result;
        private boolean oldResult = false;

        /**
                Получить результат
                @return результат вычисления
        */ 
        public double getResult(){
                return this.result;
        }

        /**
                Очистить результат вычисления
        */
        public void cleanResult(){
                this.result = 0;
        }

        /**
                Использовать/не использовать старый результат
        */
        public void setOldResult(boolean res){
                oldResult = res;
        }

        /**
                Сумируем аргументы
                @param param1 1-ое слогаемое
                @param param2 2-ое слогаеиое
        */
        public void add(double param1, double param2){
              if (oldResult)
                this.result = this.result + param1 + param2;
              else
                this.result = param1 + param2;
        }

        /**
                Вычитаем аргументы
                @param param1 1-ое вычитаемое
                @param param2 2-ое вычитаемое
        */
        public void subtract(double param1, double param2){
              if (oldResult)
                this.result = this.result - param1 - param2;
              else
                this.result = param1 - param2;
        }

        /**
                Умножаем аргументы
                @param param1 1-ое умножаемое
                @param param2 2-ое умножаемое
        */
        public void multiplication(double param1, double param2){
              if (oldResult)
                this.result = this.result * param1 * param2;
              else
                this.result = param1 * param2;
        }

        /**
                Деление аргументов
                @param param1 1-ое делимое
                @param param2 2-ое делимое
        */
        public void division(double param1, double param2){
              if (oldResult)
                this.result = this.result / param1 / param2;
              else
                this.result = param1 / param2;
        }

        /**
                Извлечение корня
                @param param1 число, которое нужно возвести в степень
                @param param2 степень в которую нужно возвести
        */
        public void involution(double param1, double param2){
              if (oldResult){
                this.result = Math.pow(Math.pow(this.result, param1),param2);
              } else {
                this.result = Math.pow(param1, param2);
              }
        }


}
