package model;

public class Monkey extends Mammal{
//    public Monkey(){
//        super(4,"Maimuta", 37.0f, 85.4f);
//    }
    public Monkey() {
        this.setNrOfLegs(4);
        this.setName("Maimuta");
        this.setNormalBodyTemp(37.0f);
        this.setPercBodyHair(85.4f);
    }

    public Monkey(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
        super(nrOfLegs, name, normalBodyTemp, percBodyHair);
    }
}
