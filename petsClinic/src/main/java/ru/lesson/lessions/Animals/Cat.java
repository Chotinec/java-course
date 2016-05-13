package ru.lesson.lessions.Animals;

import ru.lesson.lessions.Animals.Animal;

/**
 *      Cat realisation. He can say "Miau" and catch mouses.
 */
public class Cat extends Animal {

        /**
         *      Constructor.
         *      @param name animal name
         */
        public Cat(final String name){
                super(name);
        }
        
        /**
         *      Catch mouse
         */
        public void catchMouse(){}

         /**
         *      (@inheritDoc)
         */
        @Override
        public void makeSound(){
                System.out.println(String.format("May %s : ",this.getName()));
        }
        
             
}
