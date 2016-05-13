package ru.lesson.lessions;

import ru.lesson.lessions.Animals.Animal;
import ru.lesson.lessions.Animals.Cat;
import ru.lesson.lessions.Animals.Dog;
import ru.lesson.lessions.Interfaces.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by art on 12.05.16.
 */
public class PetCreator {

    /**
     * Pet factory
     * @param petType (cat or dog)
     * @param name pet name
     * @return pet
     */
    public static Pet createPet(String petType, String name){
        Pet pet = null;
        if ("dog".equals(petType)){
            pet = new Dog(new Animal(name));
        }
        if ("cat".equals(petType)){
            pet = new Cat(name);
        }
        return pet;
    }
}
