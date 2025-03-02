package factory;

import model.*;

public class ReptileFactory extends SpeciesFactory{
    public Animal getAnimal(String type) throws Exception {
        RandomGeneratorAtributtes randomGeneratorAtributtes=new RandomGeneratorAtributtes();
        Integer nrOfLegs=randomGeneratorAtributtes.randomNrLegs();
        String name=randomGeneratorAtributtes.randomNames();
        boolean laysEggs= randomGeneratorAtributtes.randomCanFly_randomIsDangerous_randomMigrates_laysEggs();

        if (Constants.Animals.Reptiles.CROCODILE.equals(type)){
            return new Crocodile(nrOfLegs,name,laysEggs);
        }else if(Constants.Animals.Reptiles.SNAKE.equals(type)){
            return new Snake(nrOfLegs,name,laysEggs);
        }else if(Constants.Animals.Reptiles.TURTLE.equals(type)){
            return new Turtle(nrOfLegs,name,laysEggs);
        }
        else{
            throw new Exception("Invalid animal exception!");
        }
    }
}
