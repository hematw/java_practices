
package com.mycompany.oop3;

/**
 *
 * @author Who Am I
 */
public abstract class Animal {
    int nFoot;
    boolean Gender;
    boolean Wings;
    String lifeZone;
    String Food;
    String Color;
    
    
    public void move(){
        System.out.println("The animal is moving");
    }
    
    public void eat(){
        System.out.println("Animals can eat");
    }
    
    abstract public void makeSound();
    
    public Animal(int foot, boolean gender, boolean wings, String life, String food, String color ){
        nFoot=foot;
        Gender=gender;
        Wings=wings;
        lifeZone=life;
        Food=food;
        Color=color;
    }
    
    public Animal(){
        
    }
}
