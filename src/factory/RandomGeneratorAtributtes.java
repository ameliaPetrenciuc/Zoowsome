package factory;

import model.Aquatic;

import java.util.Random;

public class RandomGeneratorAtributtes {

    private static Random rand=new Random();

    public Integer randomNrLegs(){
        return rand.nextInt(10);
    }

    public String randomNames(){
        String[] animalNames={
                "Teddy", "Rex", "Buddy", "Max", "Bella", "Charlie", "Milo", "Oscar",
                "Simba", "Rocky", "Cooper", "Daisy", "Luna", "Bailey", "Sadie",
                "Oliver", "Bear", "Zeus", "Coco", "Sparky", "Ziggy", "Rosie",
                "Buster", "Chase", "Bentley", "Ruby", "Harley", "Shadow", "Finn",
                "Oreo", "Duke", "Gizmo", "Zorro", "Whiskers", "Moose", "Leo",
                "Lola", "Marley", "Peanut", "Bruno", "Honey"
        };
        return animalNames[rand.nextInt(animalNames.length)];
    }

    public float randomBodyTemp(){
        return 30.0f + rand.nextFloat() * (40.0f - 30.0f);
    }

    public float randomBodyHair(){
        return 80.0f + rand.nextFloat() * (100.0f - 80.0f);
    }

    public boolean randomCanFly_randomIsDangerous_randomMigrates_laysEggs(){
        return rand.nextBoolean();
    }

    public Integer randomAvgSwimDepth_randomAvgFlightAltitude(){
        return rand.nextInt(200);
    }

    public Aquatic.WaterType randomWaterType(){
        Aquatic.WaterType[] types= Aquatic.WaterType.values();
        return types[rand.nextInt(types.length)];
    }




















}
