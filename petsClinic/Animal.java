/**
 *       Base class Animal
 */
public class Animal implements Pet{
     
        /**
         *       Pets name
         */   
        private final String name; 

        /**
         *      constructor.
         *      @param name animal name
         */
        public Animal(final String name){
                this.name = name;
        }  

        /**
         *      the votes cast
         */
        @Override
        public void makeSound(){
                System.out.println(String.format("%s say : %s",this.name,"beep"));
        }

        @Override
        public String getName(){
                return this.name;
        }

        /**
         *      Is animal hungry?
         *      return true if yes.
         */
        private boolean isHungry(){
                //TODO create algoriym
                return true;
        }
        
}
