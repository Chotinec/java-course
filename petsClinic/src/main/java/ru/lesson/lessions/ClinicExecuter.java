package ru.lesson.lessions;

import ru.lesson.lessions.Interfaces.Input;
import ru.lesson.lessions.Interfaces.Output;
import ru.lesson.lessions.Interfaces.Pet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by art on 13.05.16.
 */
public class ClinicExecuter {

    private Input input = new InputClinic();
    private Output output = new OutputClinic();

    private Clinic clinic;

    public ClinicExecuter(Clinic clinic){
        this.clinic = clinic;
    }

    /**
     * Print all clients
     */
    public void printClinic(){
        printList(clinic.getClients());
    }

    /**
     * Add client to clinic
     */
    public void addClient(){
        String clientId = input.ask("Write client ID :");
        String petName = input.ask("Write pet name :");
        String petType = input.ask("Write pet :");
        Pet pet =PetCreator.createPet(petType,petName);
        if (pet == null){
            output.printLn("There is no such pet!");
        }else{
            clinic.addClient(new Client(clientId,pet));
        }
    }

    /**
     * Delete client by pet name
     */
    public void deleteClientByPet(){
        String petName = input.ask("Write Pet name :");
        clinic.deleteClientByPetName(petName);
    }

    /**
     * Delete client by pet name
     */
    public void deleteClientByClientId(){
        String clientId = input.ask("Write client ID :");
        clinic.deleteClientByClientId(clientId);
    }

    /**
     * Find client by pet name
     */
    public void findClientByPetName(){
        String petName = input.ask("Write Pet name :");
        ArrayList<Client> findClients = clinic.findClientByPetName(petName);
        if (findClients.size() == 0){
            output.printLn(String.format("No pets with name: %s",petName));
        }else{
            printList(findClients);
        }
    }

    /**
     * Find client by clientId
     */
    public void findClientByClientId(){
        String clientId = input.ask("Write client ID :");
        ArrayList<Client> findClients = clinic.findClientByClientName(clientId);
        if (findClients.size() == 0){
            output.printLn(String.format("No clients with ID: %s",clientId));
        }else{
            printList(findClients);
        }
    }


    /**
     * Pint list
     * @param list for print
     */
    private void printList(List<Client> list){
        for (Client client : list){
            output.printLn(String.format("Client ID: %s, Pet name: %s", client.getId(),client.getPet().getName()));
        }
    }
}
