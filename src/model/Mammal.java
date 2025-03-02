package model;

public class Mammal extends Animal{
    private float normalBodyTemp;
    private float percBodyHair;

    public Mammal() {
    }

    public Mammal(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
        super(nrOfLegs, name);
        this.normalBodyTemp = normalBodyTemp;
        this.percBodyHair = percBodyHair;
    }

    public float getNormalBodyTemp() {
        return normalBodyTemp;
    }

    public void setNormalBodyTemp(float nromalBodyTemp) {
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
