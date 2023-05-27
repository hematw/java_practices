
package com.mycompany.oop3;

/**
 *
 * @author Who Am I
 */
public class Monkey extends Animal {
     public void jump(){
        System.out.println("Animals Can make jump");
    }
     
     public void loveBanana(){
         System.out.println("Monkeys love Banana");
     }

    @Override
    public void makeSound() {
        System.out.println("Monkey says quang quang ");

    }

}
