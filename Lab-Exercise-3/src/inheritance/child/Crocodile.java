package inheritance.child;
import inheritance.parent.Reptile;

public class Crocodile extends Reptile {

    public Crocodile() {
        super(3, 100, "Reptile", "A", "Scaly Skin", "Backbone", "Hard-shelled Eggs");
    }


    public Crocodile(int height, int weight, String animalType, String bloodType, String skinType, String bone,
            String eggType) {
        super(height, weight, animalType, bloodType, skinType, bone, eggType);
    }

    @Override
    public void showInfo() {
        System.out.println("Crocodile [height=" + getHeight() + " m, weight= " 
        + getWeight() + " kg, animalType=" + getAnimalType() + ", bloodType=" + 
        getBloodType() + "skinType=" + getSkinType() + ", bone=" + getBone() + ", eggType=" + getEggType() + "]");
    }

}
