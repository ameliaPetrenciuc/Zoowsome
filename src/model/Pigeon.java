package model;

public class Pigeon extends Bird{
//    public Pigeon(){
//        super(2,"Porumb", false,20);
//    }
    public Pigeon(){
        this.setNrOfLegs(2);
        this.setName("Porumb");
        this.setMigrates(false);
        this.setAvgFlightAltitude(20);
    }

    public Pigeon(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude){
        super(nrOfLegs, name, migrates, avgFlightAltitude);
    }


}
