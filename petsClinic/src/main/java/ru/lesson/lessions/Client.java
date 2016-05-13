package ru.lesson.lessions;

import ru.lesson.lessions.Interfaces.Pet;

/**
*       Client class
*/
public class Client{
        private  String id;
        private Pet pet;

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

        /**
        * Set pet
        * @param pet
        */
        public void setPet(Pet pet){
                this.pet = pet;
        }

        /**
        * Set id
        * @param id
        */
        public void setId(String id){
                this.id = id;
        }


}
