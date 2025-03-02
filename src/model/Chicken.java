package model;

public class Chicken extends Bird{
//    public Chicken(){
//    super(2,"Pui",false, 1);
//    }
    public Chicken(){
        this.setNrOfLegs(2);
        this.setName("Pui");
        this.setMigrates(false);
        this.setAvgFlightAltitude(1);
    }

    public Chicken(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude){
        super(nrOfLegs, name, migrates, avgFlightAltitude);
    }
}
