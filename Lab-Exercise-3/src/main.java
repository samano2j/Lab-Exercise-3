import inheritance.Animal;
import inheritance.parent.Bird;
import inheritance.parent.Fish;
import inheritance.parent.Reptile;
import inheritance.child.Crocodile;
import inheritance.child.Eagle;
import inheritance.child.Eel;

public class main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.showInfo();

        Reptile reptile = new Reptile();
        reptile.showInfo();

        Fish fish = new Fish();
        fish.showInfo();

        Bird bird = new Bird();
        bird.showInfo();

        Crocodile crocodile = new Crocodile();
        crocodile.showInfo();

        Eel eel = new Eel();
        eel.showInfo();
        
        Eagle eagle = new Eagle();
        eagle.showInfo();
    }
}
