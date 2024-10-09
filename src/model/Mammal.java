package model;

public class Mammal extends Animal{
    private float normalBodyTemp;
    private float percBodyHair;

    public Mammal() {
    }

    public Mammal(Integer nrOfLegs, String name, float nromalBodyTemp, float percBodyHair) {
        super(nrOfLegs, name);
        this.normalBodyTemp = nromalBodyTemp;
        this.percBodyHair = percBodyHair;
    }

    public float getNromalBodyTemp() {
        return normalBodyTemp;
    }

    public void setNromalBodyTemp(float nromalBodyTemp) {
        this.normalBodyTemp = nromalBodyTemp;
    }

    public float getPercBodyHair() {
        return percBodyHair;
    }

    public void setPercBodyHair(float percBodyHair) {
        this.percBodyHair = percBodyHair;
    }

    public String toString() {
        return super.toString() + ", Normal Body Temp: " + normalBodyTemp + ", % Body Hair: " + percBodyHair;
    }
}
