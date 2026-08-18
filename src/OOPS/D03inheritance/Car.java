package OOPS.D03inheritance;

public class Car extends Vehicle{

    public int noOfDoors;
    public String transmissionType;

    public Car(String name, String modle, int noOfTyres,int noOfDoors, String transmissionType){
        super(name, modle, noOfTyres);
        this.noOfDoors = noOfTyres;
        this.transmissionType = transmissionType;
    }

    public void startAC(){
        System.out.println(name +"'s "+ modle +  " AC started");
    }
}
