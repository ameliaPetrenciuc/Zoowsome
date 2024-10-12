package model;

public class Cockroach extends Insect{
//    public Cockroach(){
//        super(8,"Gandac",false, true);
//    }
    public Cockroach(){
        this.setNrOfLegs(8);
        this.setName("Gandac");
        this.setCanFly(false);
        this.setDangerous(true);
    }

    public Cockroach(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous){
        super(nrOfLegs, name, canFly, isDangerous);
    }
}
