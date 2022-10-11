package inheritance.parent;
import inheritance.Animal;

public class Bird extends Animal{
    private String coverIn;
    private String canDo;

    public Bird() {
        super(2,3,"Bird","AB");
        this.coverIn = "Feather";
        this.canDo = "Fly";
    }

    public Bird(int height, int weight, String animalType, String bloodType, String coverIn, String canDo) {
        super(height, weight, animalType, bloodType);
        this.coverIn = coverIn;
        this.canDo = canDo;
    }

    @Override
    public void showInfo() {
        System.out.println("Bird [height=" + getHeight() + " m, weight= " 
        + getWeight() + " kg, animalType=" + getAnimalType() + ", bloodType=" + 
        getBloodType() + ", coverIn=" + coverIn + ", canDo=" + canDo + "]");
    }

    public String getCoverIn() {
        return coverIn;
    }

    public void setCoverIn(String coverIn) {
        this.coverIn = coverIn;
    }

    public String getCanDo() {
        return canDo;
    }

    public void setCanDo(String canDo) {
        this.canDo = canDo;
    }

}
