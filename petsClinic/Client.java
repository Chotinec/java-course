/**
*       Client class
*/
public class Client{
        private final String id;
        private final Pet pet;

        public Client(String id, Pet pet){
                this.id = id;
                this.pet = pet;
        }

        /*
         *      Get pet 
         */
        public Pet getPet(){
                return this.pet;
        }

        /*
         *      Get id
         */
        public String getId(){
                return this.id;
        }
}
