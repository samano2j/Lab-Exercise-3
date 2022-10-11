package inheritance.child;
import inheritance.parent.Fish;

public class Eel extends Fish{
    private String canDo;

    public Eel() {
        this.canDo = "Release electric charge";
    }

    public Eel(int height, int weight, String animalType, String bloodType, String liveIn, String breathThrough,
            String canDo) {
        super(height, weight, animalType, bloodType, liveIn, breathThrough);
        this.canDo = canDo;
    }

    @Override
    public void showInfo() {
        System.out.println("Eel [height=" + getHeight() + " m, weight= " 
        + getWeight() + " kg, animalType=" + getAnimalType() + ", bloodType=" + 
        getBloodType() + ", liveIn=" + getLiveIn() + ", breathThrough=" + getBreathThrough() + ", canDO=" + canDo + "]");
    }

    public String getCanDo() {
        return canDo;
    }

    public void setCanDo(String canDo) {
        this.canDo = canDo;
    }

    
}
