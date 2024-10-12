package factory;

import model.Animal;
import model.Cow;
import model.Monkey;
import model.Tiger;

public class MammalFactory extends SpeciesFactory{

    public Animal getAnimal(String type) throws Exception {

        RandomGeneratorAtributtes randomGeneratorAtributtes=new RandomGeneratorAtributtes();
        Integer nrOfLegs=randomGeneratorAtributtes.randomNrLegs();
        String name=randomGeneratorAtributtes.randomNames();
        Float bodyTemp= randomGeneratorAtributtes.randomBodyTemp();
        Float bodyHair= randomGeneratorAtributtes.randomBodyHair();

        if (Constants.Animals.Mammals.COW.equals(type)){
            return new Cow(nrOfLegs, name, bodyTemp, bodyHair);
        }else if(Constants.Animals.Mammals.TIGER.equals(type)){
            return new Tiger(nrOfLegs, name, bodyTemp, bodyHair);
        }else if(Constants.Animals.Mammals.MONKEY.equals(type)){
            return new Monkey(nrOfLegs, name, bodyTemp, bodyHair);
        }
        else{
            throw new Exception("Invalid animal exception!");
        }
    }
}
