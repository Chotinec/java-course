import java.util.Arrays;

/**
*       class describe clinic
*/
public class Clinic{
        
        /**
        *       Array of clients
        */
        private Client[] clients;

        public Clinic(final int size){
                clients = new Client[size];
                Arrays.fill(clients, null);
        }

        /**
        *       Add client
        *       @param position
        *       @param Client
        */
        public void addClient(final int position, Client client){
                if (position < 0 || position >= clients.length){
                        ConsoleHelper.writeMessage("Invalid adding position!");
                        return;
                }
                this.clients[position] = client;
        }

        /**
         *      Remove client
         *      @param position in the clients array
         */
        public void removeClient(final int position){
                if (position < 0 || position >= clients.length){
                        ConsoleHelper.writeMessage("Invalid removing position!");
                        return;
                }
                clients[position] = null;
        }

        /**
         *      Get clients
         */
        public Client[] getClients(){
                return this.clients;
        }
        
        /**
        *       Serch client by pet name
        *       @param name pet name
        */
        public Client[] findClientByPetName(final String name){
                Client[] tmpClients = new Client[clients.length];
                if (name == null)
                        return null;
                int j = 0;
                for (int i = 0; i < clients.length; i++){
                        if (clients[i] == null){
                                continue;
                        }
                        if (name.equals(clients[i].getPet().getName())){
                              tmpClients[j] = clients[i];
                              j++;  
                        }
                }

                Client[] foundClients = new Client[j];
                for (int i = 0; i < j; i++){
                        foundClients[i] = tmpClients[i];
                }
                return foundClients;
        }

        
}
