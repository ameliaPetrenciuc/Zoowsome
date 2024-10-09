package model;

public class Bird extends Animal{
    private boolean migrates;
    private Integer avgFlightAltitude;

    public Bird(){

    }
    public Bird(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) {
        super(nrOfLegs, name);
        this.migrates = migrates;
        this.avgFlightAltitude = avgFlightAltitude;
    }

    public boolean isMigrates() {
        return migrates;
    }

    public void setMigrates(boolean migrates) {
        this.migrates = migrates;
    }

    public Integer getAvgFlightAltitude() {
        return avgFlightAltitude;
    }

    public void setAvgFlightAltitude(Integer avgFlightAltitude) {
        this.avgFlightAltitude = avgFlightAltitude;
    }
}
