package model;

public class Crocodile extends Reptile{

//    public Crocodile(){
//        super(4,"Crocodil",true);
//    }
    public Crocodile(){
        this.setNrOfLegs(4);
        this.setName("Crocodil");
        this.setLaysEggs(true);
    }

    public Crocodile(Integer nrOfLegs, String name, boolean laysEggs){
        super(nrOfLegs,name,laysEggs);
    }
}
