package model;

public class Turtle extends Reptile{

//    public Turtle() {
//        super(4, "Testoasa",true);
//    }
    public Turtle(){
        this.setNrOfLegs(4);
        this.setName("Testoasa");
        this.setLaysEggs(true);
    }

    public Turtle(Integer nrOfLegs, String name, boolean laysEggs){
        super(nrOfLegs, name, laysEggs);

    }
}
