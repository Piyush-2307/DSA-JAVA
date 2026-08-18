package OOPS.D03inheritance;

public class MotorCycle extends Vehicle{

    public String handlebarStyle;
    public String suspensionType;

    public MotorCycle(String name, String modle, int noOfTyres, String handlebarStyle, String suspensionType){
        super(name, modle, noOfTyres);
        this.handlebarStyle = handlebarStyle;
        this.suspensionType = suspensionType;
    }

    public void Wheelei(){
        System.out.println(name +"'s "+ modle +  " is doing wheelie");
    }
}
