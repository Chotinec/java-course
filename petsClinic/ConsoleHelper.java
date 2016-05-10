import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Operations with console
 */
public class ConsoleHelper{
        
        /**
         *      Input string
         */
        public static String readString(){
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String str = null;
                try
                {
                        str = br.readLine();
                }
                catch (Exception e)
                {

                }
                if ("EXIT".equalsIgnoreCase(str))
                {
                        ConsoleHelper.writeMessage("the end");
                        throw new RuntimeException();
                }
    
                return str;
        }

        /**
         *      Write String
         *      @param message witch need to run 
         */
        public static void writeMessage(String message){
                System.out.println(message);
        }

        /**
         *      Ask operation
         */
        public static int askOperation(){
                writeMessage("Choose operation: 1 - add client, 2 - remove client, 3 - find client");
                int number;
                while (true){
                        String str = readString();                       
                        try{
                                number = Integer.parseInt(str);
                        } catch (Exception e){
                                writeMessage("Incorrect data, try again!");
                                continue;
                        }
                        if (number <= 0 && number >= 4){
                               writeMessage("Invalid data, try again!"); 
                                continue;
                        }
                        break;
                }
                return number;
        }

        /**
         *      Choose pet
         *
         */
        public static int askPet(){
                writeMessage("Choose pet: 1 - Cat, 2 - Dog");
                int number;
                 while (true){
                        String str = readString();                       
                        try{
                                number = Integer.parseInt(str);
                        } catch (Exception e){
                                writeMessage("Incorrect data, try again!");
                                continue;
                        }
                        if (number <= 0 && number >= 3){
                               writeMessage("Invalid data, try again!"); 
                                continue;
                        }
                        break;
                }
                return number;
        }

         /**
         *      Ask pet name
         *
         */
        public static String askPetName(){
                writeMessage("Write pet name: ");
                String name = readString();
                return name;
        } 

        /**
         *      Ask client id
         *
         */
        public static String askClientId(){
                writeMessage("Write client Id: ");
                String id = readString();
                return id;
        } 

        /**
         *      Ask position for remove client
         *
         */
        public static int askRemovingPosition(){
                writeMessage("Write position for removing: ");
                int number;
                while (true){
                        String position = readString();
                        try{
                                number = Integer.parseInt(position);
                        } catch (Exception e){
                                writeMessage("Incorrect data, try again!");
                                continue;
                        }
                        break;
                }
                return number;
        }

        /**
         *      Ask position for adding client
         *
         */
        public static int askAddingPosition(){
                writeMessage("Write position for adding: ");
                int number;
                while (true){
                        String position = readString();
                        try{
                                number = Integer.parseInt(position);
                        } catch (Exception e){
                                writeMessage("Incorrect data, try again!");
                                continue;
                        }
                        break;
                }
                return number;
        }

        /**
         *      Print clinic 
         *      @param Clients array
         */
        public static void printClinic(Client[] clients){
                if (clients == null || clients.length == 0){
                       writeMessage("No Clients in the clinic"); 
                       return;
                }
                for (int i = 0; i < clients.length; i++){
                        if (clients[i] == null){
                                continue;
                        }
                        writeMessage("Client id - " + clients[i].getId() + " Pet name - " + clients[i].getPet().getName());
                }
        }
}
