package factory;

import model.Animal;

import java.util.Random;

public class RandomFactoryGenerator {
    AnimalFactory abstractRandomFactory=new AnimalFactory();
    // I create a list with all species
    int totalNr=50;
    Random rand=new Random();

    String[] species={Constants.Species.MAMMALS,
                Constants.Species.INSECTS,
                Constants.Species.AQUATICS,
                Constants.Species.BIRDS,
                Constants.Species.REPTILES
                };

    //I want random species
    public void generateRandomAnimals() throws Exception {
        for (int i = 0; i < totalNr; i++) {
            String randomSpecies = species[rand.nextInt(species.length)];
            SpeciesFactory speciesFactory = abstractRandomFactory.getSpeciesFactory(randomSpecies);

            //random name from that specific species
            String randomAnimalType=getRandomAnimal(randomSpecies,rand);
            Animal animalRandom=speciesFactory.getAnimal(randomAnimalType);

            System.out.println(animalRandom);
        }
    }

    private static String getRandomAnimal(String species, Random rand) throws Exception {
        String[] animalTypes;
        switch(species){
            case Constants.Species.MAMMALS:
                animalTypes=new String[] {
                        Constants.Animals.Mammals.TIGER,
                        Constants.Animals.Mammals.COW,
                        Constants.Animals.Mammals.MONKEY
                };
                break;

            case Constants.Species.INSECTS:
                animalTypes=new String[] {
                        Constants.Animals.Insects.SPIDER,
                        Constants.Animals.Insects.COCKROACH,
                        Constants.Animals.Insects.BUTTERFLY
                };
                break;

            case Constants.Species.AQUATICS:
                animalTypes=new String[] {
                        Constants.Animals.Aquatics.JELLYFISH,
                        Constants.Animals.Aquatics.FISH,
                        Constants.Animals.Aquatics.SHARK
                };
                break;

            case Constants.Species.BIRDS:
                animalTypes=new String[] {
                        Constants.Animals.Birds.PIGEON,
                        Constants.Animals.Birds.CHICKEN,
                        Constants.Animals.Birds.JAY
                };
                break;

            case Constants.Species.REPTILES:
                animalTypes=new String[] {
                        Constants.Animals.Reptiles.TURTLE,
                        Constants.Animals.Reptiles.SNAKE,
                        Constants.Animals.Reptiles.CROCODILE
                };
                break;
            default:
                throw new Exception("Error");
        }

        return animalTypes[rand.nextInt(animalTypes.length)];
    }






}
