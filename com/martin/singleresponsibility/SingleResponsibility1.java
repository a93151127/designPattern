package com.martin.singleresponsibility;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("公車");
        vehicle.run("腳踏車");
        vehicle.run("飛機");
    }
}

class Vehicle{
    public void run(String tool){
        System.out.println(tool + " 在公路上運行 ");
    }
}
