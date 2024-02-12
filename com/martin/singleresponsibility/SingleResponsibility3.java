package com.martin.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle3 vehicle = new Vehicle3();
        vehicle.roldRun("公車");
        vehicle.airRun("飛機");
    }
}

class Vehicle3{
    public void roldRun(String tool){
        System.out.println(tool + " 在公路上運行 ");
    }

    public void airRun(String tool){
        System.out.println(tool + " 在空中運行 ");
    }
}
