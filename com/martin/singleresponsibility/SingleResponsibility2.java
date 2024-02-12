package com.martin.singleresponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("公車");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飛機");

    }

}
class RoadVehicle{
    public void run(String tool){
        System.out.println(tool + " 在公路上運行 ");
    }
}

class AirVehicle{
    public void run(String tool){
        System.out.println(tool + " 在空中運行 ");
    }
}
