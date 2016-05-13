package ru.lesson.lessions.Interfaces;

/**
*       Discribe pet's behavior
*/
public interface Pet{
        /**
        *       Get pet name
        */
        String getName();
        
        /**
        *       Say sound
        */
        void makeSound();

    /**
     * Set name
     * @param name
     */
    void setName(String name);

}
