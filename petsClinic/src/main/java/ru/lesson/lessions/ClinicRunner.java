package ru.lesson.lessions;

import ru.lesson.lessions.Animals.Animal;
import ru.lesson.lessions.Animals.Cat;
import ru.lesson.lessions.Animals.Dog;
import ru.lesson.lessions.Interfaces.Input;
import ru.lesson.lessions.Interfaces.Output;

/**
*       Work clinic
*/
public class ClinicRunner{

    private Input input = new InputClinic();
    private Output out = new OutputClinic();
        
        public static void main(String[] args) {
            Clinic clinic = new Clinic();
            ClinicExecuter clinicExecuter = new ClinicExecuter(clinic);

            ClinicRunner clinicRunner = new ClinicRunner();

            clinic.getClients().add(new Client("Brown", new Cat("Digy")));
            clinic.getClients().add(new Client("Nick", new Dog(new Animal("Sparky"))));

            clinicRunner.action(clinicExecuter);

        }

        public void action(ClinicExecuter clinicExecuter){
            do{
                String operation = input.ask("Ener operation :\n1 -print clinic,\n2 - add new client,\n" +
                        "3 - delete client by pet name,\n4 - delete client by client ID,\n" +
                        "5 - find clients by pet name,\n6 - find clients by client ID");
                int number = 0;
                try {
                    number = Integer.parseInt(operation);
                }catch (Exception e){
                    out.printLn("This is not a number! Try again.");
                }

                switch (number){
                    case 1: clinicExecuter.printClinic(); break;
                    case 2: clinicExecuter.addClient(); break;
                    case 3: clinicExecuter.deleteClientByPet(); break;
                    case 4: clinicExecuter.deleteClientByClientId(); break;
                    case 5: clinicExecuter.findClientByPetName(); break;
                    case 6: clinicExecuter.findClientByClientId(); break;
                    default:out.printLn("Incorrect number of operation! Try again.");
                }
            } while ("yes".equals(input.ask("Do you whant to continue? yes/no")));
        }
}
