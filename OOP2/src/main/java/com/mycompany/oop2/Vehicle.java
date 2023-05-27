
package com.mycompany.oop2;


/**
 *
 * @author Who Am I
 */
public class Vehicle {
   
   
    public void hello(){
        System.out.println("hello i am driving Vehicle");
    }
    
   
    
    
    private String company;
    private String color;
    private int price;
    String vehicleModel;
    protected int maxSpeed;
    int numberOfSeats;
    boolean aiFeature;
    String powerSupplyType;
    
    public void turnOn(){
        System.out.println("The "+vehicleModel + "has been turned On @>==");
    }

    public void start() {
        System.out.println("Your " + vehicleModel + " car has Started!");
    }
    
    public void Break() {
        System.out.println("Your " + vehicleModel + " was stopped");
    }
    
    public void setPrice(int money) {
        this.price = money;
    }

    public int getPrice() {
        return price;
    }
    
 
    }
    
