package controller;

import factory.AnimalFactory;
import factory.Constants;
import factory.SpeciesFactory;
import model.Animal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainController {
    public static void main(String[] args) {
       AnimalFactory abstractFactory=new AnimalFactory();

        SpeciesFactory mamalSpeciesFactory=abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
        Animal vaca=mamalSpeciesFactory.getAnimal(Constants.Animals.Mammals.COW);
        System.out.println(vaca);


    }
}