package model;

public abstract class Animal {

    private Integer nrOfLegs;
    private String name;

    public Animal(){

    }

    public Animal(Integer nrOfLegs, String name) {
        this.nrOfLegs = nrOfLegs;
        this.name = name;
    }

    public Integer getNrOfLegs() {
        return nrOfLegs;
    }

    public void setNrOfLegs(int nrOfLegs) {
        this.nrOfLegs = nrOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal: " + name + ", Number of Legs: " + nrOfLegs;
    }
}
