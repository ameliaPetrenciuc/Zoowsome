package model;

public class Spider extends Insect{
//    public Spider(){
//        super(30, "Paianjen", false, true);
//    }
    public Spider(){
        this.setNrOfLegs(30);
        this.setName("Paianjen");
        this.setCanFly(false);
        this.setDangerous(true);
    }

    public Spider(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous){
        super(nrOfLegs, name, canFly, isDangerous);
    }
}
