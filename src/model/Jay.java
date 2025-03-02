package model;

public class Jay extends Bird{
//    public Jay(){
//        super(2,"Gaita", true,3);
//    }
    public Jay(){
        this.setNrOfLegs(2);
        this.setName("Jay");
        this.setMigrates(true);
        this.setAvgFlightAltitude(3);
    }
    public Jay(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude){
        super(nrOfLegs, name, migrates, avgFlightAltitude);
    }
}
