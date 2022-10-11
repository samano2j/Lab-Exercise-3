package inheritance.child;
import inheritance.parent.Bird;

public class Eagle extends Bird{
    


    public Eagle() {
        super(2, 10, "Bird", "B", "Feather", "Fly");
    }

    public Eagle(int height, int weight, String animalType, String bloodType, String coverIn, String canDo) {
        super(height, weight, animalType, bloodType, coverIn, canDo);
    }

    @Override
    public void showInfo() {
        System.out.println("Eagle [height=" + getHeight() + " m, weight= " 
        + getWeight() + " kg, animalType=" + getAnimalType() + ", bloodType=" + 
        getBloodType() + ", coverIn=" + getCoverIn() + ", canDo=" + getCanDo() + "]");
    }
}
