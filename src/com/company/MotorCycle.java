package com.company;
class Vehicles{
    int model;
    int numberOfWheels;
    int numberOfSeats;
    Vehicles(int model, int numberOfWheels,int numberOfSeats){
        this.model=model;
        this.numberOfWheels=numberOfWheels;
        this.numberOfSeats=numberOfSeats;
    }
    void display(){
//        System.out.println(" FUNCTION OVERRIDING");
        System.out.println("Model:"+model+"\nNumber of seats:"+numberOfSeats+"\n Number of Wheels:"+numberOfWheels );
    }

}
class MotorCycle extends Vehicles{
    String name;
    MotorCycle(int model,int numberOfWheels,int numberOfSeats, String name){
        super(model,numberOfWheels,numberOfSeats);
        this.name=name;
    }
    void display(){
        System.out.println("FUNCTION OVERRIDING");
        System.out.println("Name:"+name);
        super.display();

    }
    int setWheels(int numberOfSeats){
        if(numberOfSeats==2){
            System.out.println("FUNCTION OVERLOADING");
            return 2;
        }
        else {
            System.out.println("FUNCTION OVERLOADING");
            return 4;
        }
    }
    void setWheels(int numberOfSeats,int numberOfWheels){
        System.out.println("______________________________");
        System.out.println("vehicle have "+numberOfWheels+" wheels and seating capacity is "+numberOfSeats);
    }
    public static void main(String args[]){
        MotorCycle bike=new MotorCycle(2021,2,2,"Pulsar");
        bike.display();
        bike.setWheels(2);
        bike.setWheels(2,2);
        MotorCycle car=new MotorCycle(2020,4,5,"swift");
//        car.display();
//        car.setWheels(4);
//        car.setWheels(5,4);
    }

}
