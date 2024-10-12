package model;

public class Reptile extends Animal{
    private boolean laysEggs;

    public Reptile(){

    }

    public Reptile(Integer nrOfLegs, String name, boolean laysEggs) {
        super(nrOfLegs, name);
        this.laysEggs = laysEggs;
    }


    public boolean isLaysEggs() {
        return laysEggs;
    }

    public void setLaysEggs(boolean laysEggs) {
        this.laysEggs = laysEggs;
    }

    public String toString() {
        return super.toString() + ", Lays eggs?: " + laysEggs;
    }
}
