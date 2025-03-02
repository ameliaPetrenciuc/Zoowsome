package controller;
import java.util.Random;

import factory.*;
import model.Animal;
import model.Cow;
import model.Tiger;

import java.util.Random;

public class MainController {
    public static void main(String[] args) throws Exception {
      AnimalFactory abstractFactory=new AnimalFactory();
//
//        SpeciesFactory mammalSpeciesFactory=abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
//        Animal a1=mammalSpeciesFactory.getAnimal(Constants.Animals.Mammals.COW);
//        System.out.println(a1);
//
//        SpeciesFactory insectSpeciesFactory=abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
//        Animal a2=insectSpeciesFactory.getAnimal(Constants.Animals.Insects.BUTTERFLY);
//        System.out.println(a2);
//
//        SpeciesFactory aquaticSpeciesFactory=abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);
//        Animal a3=aquaticSpeciesFactory.getAnimal(Constants.Animals.Aquatics.SHARK);
//        System.out.println(a3);
//
//        SpeciesFactory birdSpeciesFactory=abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
//        Animal a4=birdSpeciesFactory.getAnimal(Constants.Animals.Birds.PIGEON);
//        System.out.println(a4);
//
        SpeciesFactory reptileSpeciesFactory=abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);
        Animal a5=reptileSpeciesFactory.getAnimal(Constants.Animals.Reptiles.SNAKE);
        System.out.println(a5);

//        System.out.println("BONUS1");
//
//        RandomFactoryGenerator randomFactoryGenerator=new RandomFactoryGenerator();
//        randomFactoryGenerator.generateRandomAnimals();

//        System.out.println("BONUS2");
//
//        //SUBCLASS=>SUPERCLASS, it s works (upcasting) because every subclass is
//        //an instance of its superclass(INHERITANCE)
//        Cow cow=new Cow();
//        Animal animal=cow;
//        System.out.println(animal);
//
//        //SUPERCLASS=>SUBCLASS, this requires explicit casting and works if the superclass
//        //reference is pointing to an object of the subclass type.
//        Animal animalutz=new Cow();
//        //Cow cow2= animalutz;// works only if animalutz is a Cow, so we have to downcast
//        Cow cow2=(Cow) animalutz;
//        System.out.println(cow2);
//
//        //Cow cow3= new Tiger();it doesn t work to cast from one unrelated subclass to another
//
//        System.out.println("BONUS3");
        //implemeted RandomGeneratorAtributtes that generates random values for them

    }
}