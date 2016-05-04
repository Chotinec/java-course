import java.util.Scanner;

public class InteractRunner{
        
        /**
                Класс для запуска калькулятора
        */
        public static void main(String[] arg){
               Scanner reader = new Scanner(System.in);
               InteractRunner runner = new InteractRunner();
                try{
                        Calculator calc  = new Calculator();
                        String exit = "no";
                        boolean oldResult = false;
                        while(!exit.equals("yes")){
                                System.out.println("Choose operation: \n1 - add operation \n2 - subtract operation \n3 - multiplication operation \n4 - division operation \n5 - involution operation");
                                String operation = reader.next();
                                System.out.println("Enter first arg : ");
                                String first = reader.next();
                                System.out.println("Enter second arg : ");
                                String second = reader.next();
                                runner.doCalculation(operation,calc,oldResult,first,second);
                                System.out.println("Result is " + calc.getResult());
                                System.out.println("Exit : yes/no");
                                exit = reader.next();
                                 if (!exit.equals("yes")){
                                        System.out.println("Do you whant to use old result : yes/no");
                                        String old = reader.next();
                                        if ("yes".equals(old))
                                                oldResult = true;
                                        else
                                                oldResult = false;      
                                }
                        }
                } finally{
                        reader.close();
                }
        }

        /**
                 Произвести вычисления
        */
        public void doCalculation(String operation, Calculator calc, boolean oldResult, String first, String second){
                calc.setOldResult(oldResult);
                switch(Integer.valueOf(operation)){
                        case 1:
                            calc.add(Double.valueOf(first),Double.valueOf(second));
                            break;
                        case 2:
                            calc.subtract(Double.valueOf(first),Double.valueOf(second));
                            break;
                        case 3:
                            calc.multiplication(Double.valueOf(first),Double.valueOf(second)); 
                            break;
                        case 4:
                            calc.division(Double.valueOf(first),Double.valueOf(second)); 
                            break;
                        case 5:
                            calc.involution(Double.valueOf(first),Double.valueOf(second)); 
                            break;
                        default: 
                            System.out.println("Incorrect input, try again!");              
                }
        }        
        




}
