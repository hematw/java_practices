
package com.mycompany.oop3;

/**
 *
 * @author Who Am I
 */
public class Snake  extends Animal{
   
    
    
    public void hunt(){
        System.out.println("Snake is a Hunter");
    }
    
     public void khazidan(){
        System.out.println("Animals Can make jump");
    }

    @Override
    public void makeSound() {
               System.out.println("Snake say wissssss ");

    }

}
