
package com.codeuntiy.oop;

/**
 *
 * @author Who Am I
 */
public class Vehicle {
    private String company;
    private String color;
    private int price;
    String vehicleModel;
    int maxSpeed;
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
    
    public void setCompany(String company){
        this.company=company;
    }
    
    public String getCompany() {
        return company;
    }
    
}