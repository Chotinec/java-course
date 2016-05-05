import java.lang.Math;

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
                @param params аргументы суммирования
        */
        public void add(double param1, double param2){
              if (oldResult)
                this.result = this.result + param1 + param2;
              else
                this.result = param1 + param2;
        }

        /**
                Вычитаем аргументы
        */
        public void subtract(double param1, double param2){
              if (oldResult)
                this.result = this.result - param1 - param2;
              else
                this.result = param1 - param2;
        }

        /**
                Умножаем аргументы
        */
        public void multiplication(double param1, double param2){
              if (oldResult)
                this.result = this.result * param1 * param2;
              else
                this.result = param1 * param2;
        }

        /**
                Деление аргументов
        */
        public void division(double param1, double param2){
              if (oldResult)
                this.result = this.result / param1 / param2;
              else
                this.result = param1 / param2;
        }

        /**
                Извлечение корня
        */
        public void involution(double param1, double param2){
              if (oldResult){
                this.result = Math.pow(Math.pow(this.result, param1),param2);
              } else {
                this.result = Math.pow(param1, param2);
              }
        }


}
