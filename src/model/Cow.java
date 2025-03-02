package model;

public class Cow extends Mammal{
//    public Cow(){
//    super(4, "Vaca", 36.0f,90.0f);
//    }
    public Cow(){
        this.setNrOfLegs(4);
        this.setName("Vaca");
        this.setNormalBodyTemp(36.0f);
        this.setPercBodyHair(90.0f);
    }

    public Cow(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
        super(nrOfLegs, name, normalBodyTemp, percBodyHair);
    }
}
