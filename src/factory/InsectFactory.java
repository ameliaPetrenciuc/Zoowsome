package factory;

import model.*;

public class InsectFactory extends SpeciesFactory{
    public Animal getAnimal(String type) throws Exception {

        RandomGeneratorAtributtes randomGeneratorAtributtes=new RandomGeneratorAtributtes();
        Integer nrOfLegs=randomGeneratorAtributtes.randomNrLegs();
        String name=randomGeneratorAtributtes.randomNames();
        boolean canFly=randomGeneratorAtributtes.randomCanFly_randomIsDangerous_randomMigrates_laysEggs();
        boolean isDangerous=randomGeneratorAtributtes.randomCanFly_randomIsDangerous_randomMigrates_laysEggs();

        if (Constants.Animals.Insects.BUTTERFLY.equals(type)){
            return new Butterfly(nrOfLegs, name, canFly,isDangerous);
        }else if(Constants.Animals.Insects.COCKROACH.equals(type)){
            return new Cockroach(nrOfLegs, name, canFly,isDangerous);
        }else if(Constants.Animals.Insects.SPIDER.equals(type)){
            return new Spider(nrOfLegs, name, canFly,isDangerous);
        }
        else{
            throw new Exception("Invalid animal exception!");
        }
    }
}
