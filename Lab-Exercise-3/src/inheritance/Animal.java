package inheritance;

public class Animal {
    private int height;
    private int weight;
    private String animalType;
    private String bloodType;

    public Animal() {
        this.height = 70;
        this.weight = 80;
        this.animalType = "Animal";
        this.bloodType = "O";
    }

    public Animal(int height, int weight, String animalType, String bloodType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }

    public void showInfo() {
        System.out.println("Animal [height=" + height + " m, weight= " 
        + weight + " kg, animalType=" + animalType + ", bloodType=" + bloodType + "]");
    }


    public int getHeight() {
        return height;
    }


    public int getWeight() {
        return weight;
    }


    public String getAnimalType() {
        return animalType;
    }


    public String getBloodType() {
        return bloodType;
    }


    public void setHeight(int height) {
        this.height = height;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }


    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    
}
