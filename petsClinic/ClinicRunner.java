/**
*       Work clinic
*/
public class ClinicRunner{
        
        public static void main(String[] args){
                final Clinic clinic = new Clinic(10);
                ClinicRunner clinicRunner = new ClinicRunner();

                clinic.addClient(0,new Client("Brown", new Cat("Digy")));
                clinic.addClient(1,new Client("Nick",new Dog(new Animal("Sparky"))));

                int operation = ConsoleHelper.askOperation();
                switch(operation){
                         case 1:
                            String clientId = ConsoleHelper.askClientId();
                            Pet pet = clinicRunner.petCriation();
                            Client client = new Client(clientId,pet);
                            int positionForAdding = ConsoleHelper.askAddingPosition();
                            clinic.addClient(positionForAdding,client);
                            ConsoleHelper.printClinic(clinic.getClients());
                            break;
                        case 2:
                            int positionForRemoving = ConsoleHelper.askRemovingPosition();
                            clinic.removeClient(positionForRemoving);
                            ConsoleHelper.printClinic(clinic.getClients());
                            break;
                        case 3:
                            String name = ConsoleHelper.askPetName();
                            Client[] findClients = clinic.findClientByPetName(name);
                            ConsoleHelper.printClinic(findClients);
                            break;
                }
        }

        /**
         *      Create pet
         */
        public Pet petCriation(){
                int number = ConsoleHelper.askPet();
                Pet pet;
                String name = ConsoleHelper.askPetName();
                if (number == 1){ 
                       pet = new Cat(name);   
                } else {
                       pet = new Dog(new Animal(name));
                }
                return pet;
        }
}
