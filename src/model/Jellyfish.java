package model;

public class Jellyfish extends Aquatic{
//    public Jellyfish(){
//        super(0,"Meduza", 150,WaterType.FRESHWATER);
//    }
    public Jellyfish(){
        this.setNrOfLegs(0);
        this.setName("Meduza");
        this.setAvgSwimDepth(150);
        this.setWaterType(WaterType.SALTWATER);
    }

    public Jellyfish(Integer nrOfLegs, String name, Integer avgSwimDepth,WaterType waterType){
        super(nrOfLegs, name, avgSwimDepth, waterType);
    }

}
