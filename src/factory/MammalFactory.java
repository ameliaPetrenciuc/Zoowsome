package factory;

import model.Animal;
import model.Cow;

public class MammalFactory extends SpeciesFactory{

    public Animal getAnimal(String type) {
        if (Constants.Animals.Mammals.COW.equals(type)){
            return new Cow();
        }else{
            return null;
        }
    }
}
