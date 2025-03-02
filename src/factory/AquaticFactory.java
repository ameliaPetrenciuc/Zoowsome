package factory;

import model.*;

public class AquaticFactory extends SpeciesFactory {

    public Animal getAnimal(String type) throws Exception {
        RandomGeneratorAtributtes randomGeneratorAtributtes=new RandomGeneratorAtributtes();
        Integer nrOfLegs=randomGeneratorAtributtes.randomNrLegs();
        String name=randomGeneratorAtributtes.randomNames();
        Integer avgSwimDepth= randomGeneratorAtributtes.randomAvgSwimDepth_randomAvgFlightAltitude();
        Aquatic.WaterType types=randomGeneratorAtributtes.randomWaterType();

        if (Constants.Animals.Aquatics.FISH.equals(type)){
            return new Fish(nrOfLegs,name,avgSwimDepth,types);
        }else if(Constants.Animals.Aquatics.SHARK.equals(type)){
            return new Shark(nrOfLegs,name,avgSwimDepth,types);
        }else if(Constants.Animals.Aquatics.JELLYFISH.equals(type)){
            return new Jellyfish(nrOfLegs,name,avgSwimDepth,types);
        }
        else{
            throw new Exception("Invalid animal exception!");
        }
    }
}
