package factory;

public class AnimalFactory {
    public SpeciesFactory getSpeciesFactory(String type) {

        if(Constants.Species.MAMMALS.equals(type)){
            return new MammalFactory();
        }


        return null;
    }
}

