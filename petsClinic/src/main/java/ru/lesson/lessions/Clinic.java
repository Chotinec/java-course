package ru.lesson.lessions;

import ru.lesson.lessions.Interfaces.Output;

import java.util.ArrayList;

/**
*       class describe clinic
*/
public class Clinic{

        Output out = new OutputClinic();

        /**
        *       List of clients
        */
        private ArrayList<Client> clients = new ArrayList<Client>();

        public Clinic() {
        }


        /**
        * Get clients
        * @return clients
        */
        public ArrayList<Client> getClients() {
                return clients;
        }

        /**
        * Add client
        * @param client
        */
        public void addClient(Client client){
            if (clients.contains(client)){
                out.printLn("Clinic contains this user.");
                return;
            }
            clients.add(client);
        }

        /**
        * Delete client by pet name
        * @param name
        */
        public void deleteClientByPetName(String name){
            Client client = null;
            for (Client cl : clients){
                if (cl.getPet().getName().equals(name)){
                    client = cl;
                }
            }
            if (clients.remove(client)){
                out.printLn("Client was removed succesfully!");
            }else{
                out.printLn("No such client!");
            }
        }

        /**
        * Delete client by client name
        * @param name
        */
        public void deleteClientByClientId(String name){
            Client client = null;
            for (Client cl : clients){
                if (cl.getId().equals(name)){
                    client = cl;
                }
            }
            if (clients.remove(client)){
                out.printLn("Client was removed succesfully!");
            }else{
                out.printLn("No such client!");
            }
        }

        /**
        * Find client by pet name
        * @param name
        * @return
        */
        public ArrayList<Client> findClientByPetName(String name){
            ArrayList<Client> findClients = new ArrayList<Client>();
            for (Client client : clients){
                if (client.getPet().getName().equals(name)){
                    findClients.add(client);
                }
            }
            return findClients;
        }

        /**
        * Find client by client name
        * @param name
        * @return
        */
        public ArrayList<Client> findClientByClientName(String name){
            ArrayList<Client> findClients = new ArrayList<Client>();
            for (Client client : clients){
                if (client.getId().equals(name)){
                    findClients.add(client);
                }
            }
            return findClients;
        }
}
