package ru.lesson.lessions;

import org.junit.Before;
import org.junit.Test;
import ru.lesson.lessions.Animals.Animal;
import ru.lesson.lessions.Animals.Cat;
import ru.lesson.lessions.Animals.Dog;
import ru.lesson.lessions.Interfaces.Pet;

import static org.junit.Assert.*;

/**
 * Created by art on 13.05.16.
 */
public class ClinicTest {


    @Test
    public void testAddClient() throws Exception {
        Clinic clinic = new Clinic();

        Pet pet1 = new Dog(new Animal("pet1"));
        Pet pet2 = new Cat("pet2");

        // create 3 clients with pets
        Client client1 = new Client("client1", pet1);
        Client client2 = new Client("client2", pet2);

        int size = clinic.getClients().size();
        Pet pet3 = new Cat("pet3");
        clinic.addClient(new Client("client3",pet3));
        assertEquals(size+1,clinic.getClients().size());
    }

    @Test
    public void testDeleteClientByPetName() throws Exception {
        Clinic clinic = new Clinic();

        Pet pet1 = new Dog(new Animal("pet1"));
        Pet pet2 = new Cat("pet2");

        // create 3 clients with pets
        Client client1 = new Client("client1", pet1);
        Client client2 = new Client("client2", pet2);

        clinic.addClient(client1);
        clinic.addClient(client2);

        int size = clinic.getClients().size();
        clinic.deleteClientByPetName("pet2");
        assertEquals(size-1,clinic.getClients().size());
    }

    @Test
    public void testDeleteClientByClientId() throws Exception {
        Clinic clinic = new Clinic();

        Pet pet1 = new Dog(new Animal("pet1"));
        Pet pet2 = new Cat("pet2");

        // create 3 clients with pets
        Client client1 = new Client("client1", pet1);
        Client client2 = new Client("client2", pet2);

        clinic.addClient(client1);
        clinic.addClient(client2);

        int size = clinic.getClients().size();
        clinic.deleteClientByClientId("client1");
        assertEquals(size-1,clinic.getClients().size());
    }


}