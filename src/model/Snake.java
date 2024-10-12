package model;

public class Snake extends Reptile{

//    public Snake() {
//        super(0,"Sarpe", true);
//    }
    public Snake(){
        this.setNrOfLegs(0);
        this.setName("Sarpe");
        this.setLaysEggs(true);
    }

    public Snake(Integer nrOfLegs, String name, boolean laysEggs){
        super(nrOfLegs, name, laysEggs);
    }
}
