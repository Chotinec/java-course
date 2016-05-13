package ru.lesson.lessions.Animals;

import ru.lesson.lessions.Interfaces.Pet;

/**
 *      Dog realisation
 */
public class Dog implements Pet {
        
        /**
         *      Pet realithation
         *
         */
        private final Pet pet;

        public Dog(final Pet pet){
                this.pet = pet;
        }

        /**
         *      (@inheritDoc)
         */
        @Override
        public void makeSound(){
                this.pet.makeSound();
                System.out.println("Gav, Gav");
        }

        @Override
        public void setName(String name) {
                this.pet.setName(name);
        }

        /**
         *      (@inheritDoc)
         */
        @Override
        public String getName(){
                return this.pet.getName();
        }
}
