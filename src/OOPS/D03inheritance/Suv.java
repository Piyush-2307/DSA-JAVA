package OOPS.D03inheritance;

public class Suv extends Car{

    public int noOfSeats;

    public Suv(String name, String modle, int noOfTyres, int noOfDoors, String transmissionType, int noOfSeats){
        super(name, modle, noOfTyres, noOfDoors, transmissionType);
        this.noOfSeats = noOfSeats;
    }

    public void offRoad(){
        System.out.println(name + "'s " + modle + " can be use as a offroad vehicle");
    }
}
