package model;

public class Insect extends Animal{
    private boolean canFly;
    private boolean isDangerous;

    public Insect(){

    }

    public Insect(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
        super(nrOfLegs, name);
        this.canFly = canFly;
        this.isDangerous = isDangerous;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }
}
