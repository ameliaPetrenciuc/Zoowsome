package model;

public class Fish extends Aquatic{
//    public Fish(){
//        super(0,"Fish", 100,WaterType.SALTWATER);
//    }
    public Fish(){
        this.setNrOfLegs(0);
        this.setName("Fish");
        this.setAvgSwimDepth(100);
        this.setWaterType(WaterType.SALTWATER);
    }

    public Fish(Integer nrOfLegs, String name, Integer avgSwimDepth,WaterType waterType){
        super(nrOfLegs, name, avgSwimDepth, waterType);
    }
}
