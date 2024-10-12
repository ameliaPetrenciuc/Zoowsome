package model;

public class Aquatic extends Animal{
    private Integer avgSwimDepth;
    public enum WaterType{SALTWATER, FRESHWATER}
    private WaterType waterType;

    public Aquatic(){

    }

    public Aquatic(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType) {
        super(nrOfLegs, name);
        this.avgSwimDepth = avgSwimDepth;
        this.waterType = waterType;
    }

    public Integer getAvgSwimDepth() {
        return avgSwimDepth;
    }

    public void setAvgSwimDepth(Integer avgSwimDepth) {
        this.avgSwimDepth = avgSwimDepth;
    }

    public WaterType getWaterType() {
        return waterType;
    }

    public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }


    public String toString() {
        return super.toString() + ", Average Swim Depth: " + avgSwimDepth + ", Water Type: " + waterType;
    }
}
