package model;

public class Shark extends Aquatic{
//    public Shark(){
//        super(0,"Rechin", 200, WaterType.FRESHWATER);
//    }
    public Shark(){
        this.setNrOfLegs(0);
        this.setName("Rechin");
        this.setAvgSwimDepth(200);
        this.setWaterType(WaterType.FRESHWATER);
    }

    public Shark(Integer nrOfLegs, String name, Integer avgSwimDepth,WaterType waterType){
        super(nrOfLegs, name, avgSwimDepth, waterType);
    }

}
