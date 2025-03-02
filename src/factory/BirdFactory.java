package factory;

import model.*;

public class BirdFactory extends SpeciesFactory{
    public Animal getAnimal(String type) throws Exception {
        RandomGeneratorAtributtes randomGeneratorAtributtes=new RandomGeneratorAtributtes();
        Integer nrOfLegs=randomGeneratorAtributtes.randomNrLegs();
        String name=randomGeneratorAtributtes.randomNames();
        boolean migrates= randomGeneratorAtributtes.randomCanFly_randomIsDangerous_randomMigrates_laysEggs();
        Integer avgFlightAltitude=randomGeneratorAtributtes.randomAvgSwimDepth_randomAvgFlightAltitude();

        if (Constants.Animals.Birds.CHICKEN.equals(type)){
            return new Chicken(nrOfLegs,name, migrates,avgFlightAltitude);
        }else if(Constants.Animals.Birds.JAY.equals(type)){
            return new Jay(nrOfLegs,name, migrates,avgFlightAltitude);
        }else if(Constants.Animals.Birds.PIGEON.equals(type)){
            return new Pigeon(nrOfLegs,name, migrates,avgFlightAltitude);
        }
        else{
            throw new Exception("Invalid animal exception!");
        }
    }
}
