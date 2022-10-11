package inheritance.parent;
import inheritance.Animal;

public class Reptile extends Animal{
    private String skinType;
    private String bone;
    private String eggType;

    public Reptile() {
        super(40, 30, "Reptile", "AB");
        this.skinType = "Dry Skin";
        this.bone = "Backbone";
        this.eggType = "Soft-shelled Eggs";
    }

    public Reptile(int height, int weight, String animalType, String bloodType, String skinType, String bone, String eggType) {
        super(height, weight, animalType, bloodType);
        this.skinType = skinType;
        this.bone = bone;
        this.eggType = eggType;
    }

    @Override
    public void showInfo() {
        System.out.println("Reptile [height=" + getHeight() + " m, weight= " 
        + getWeight() + " kg, animalType" + getAnimalType() + ", bloodType=" + 
        getBloodType() + "skinType=" + skinType + ", bone=" + bone + ", eggType=" + eggType + "]");
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getBone() {
        return bone;
    }

    public void setBone(String bone) {
        this.bone = bone;
    }

    public String getEggType() {
        return eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }
    
    
}
