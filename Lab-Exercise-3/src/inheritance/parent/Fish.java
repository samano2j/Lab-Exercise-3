package inheritance.parent;
import inheritance.Animal;

public class Fish extends Animal{
    private String liveIn;
    private String breathThrough;

    public Fish() {
        super(1, 1, "Fish", "A");
        this.liveIn = "Water";
        this.breathThrough = "Gills";
    }

    public Fish(int height, int weight, String animalType, String bloodType, String liveIn, String breathThrough) {
        super(height, weight, animalType, bloodType);
        this.liveIn = liveIn;
        this.breathThrough = breathThrough;
    }
    
    @Override
    public void showInfo() {
        System.out.println("Fish [height=" + getHeight() + " m, weight= " 
        + getWeight() + " kg, animalType" + getAnimalType() + ", bloodType=" + 
        getBloodType() + ", liveIn=" + liveIn + ", breathThrough=" + breathThrough + "]");
    }

    public String getLiveIn() {
        return liveIn;
    }

    public void setLiveIn(String liveIn) {
        this.liveIn = liveIn;
    }

    public String getBreathThrough() {
        return breathThrough;
    }

    public void setBreathThrough(String breathThrough) {
        this.breathThrough = breathThrough;
    }
    
    
}
