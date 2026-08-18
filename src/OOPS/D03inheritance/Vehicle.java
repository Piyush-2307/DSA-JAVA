package OOPS.D03inheritance;

public class Vehicle {

    public String name;
    public String modle;
    public int noOfTyres;

    public Vehicle(String name, String modle, int noOfTyres){
        this.name = name;
        this.modle = modle;
        this.noOfTyres = noOfTyres;
    }

    public void StartEngine(){
        System.out.println(name +"'s "+ modle +  " Engine Started");
    }

    public void StopEngine(){
        System.out.println(name +"'s "+ modle +  " Engine Stopped");
    }
}
