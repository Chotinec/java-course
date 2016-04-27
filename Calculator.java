public class Calculator{
       
        /**
                Результат Вычислений
        */
        private int result;

        /**
                Сумируем аргументы
                @param params аргументы суммирования
        */
        public void add(double ... params){
              for (Double param : params){
                this.result += param;
              }  
        }

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
}
