package model;

public class Butterfly extends Insect{
//    public Butterfly(){
//        super(2,"Fluture", true, false);
//    }
    public Butterfly(){
        this.setNrOfLegs(2);
        this.setName("Fluture");
        this.setCanFly(true);
        this.setDangerous(false);
    }

    public Butterfly(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous){
        super(nrOfLegs, name, canFly, isDangerous);
    }
}
