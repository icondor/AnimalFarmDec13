public class AnimalYard {

    private final int MAXANIMALS=10;
    private Animal[] animalSetInTheYard = new Animal[MAXANIMALS];

    private void addAnimals() {
        animalSetInTheYard[0]= new Dog();
        animalSetInTheYard[1]= new Cat();
        animalSetInTheYard[2]= new Cat();
        animalSetInTheYard[3]= new Cow();
        animalSetInTheYard[4]= new Cow();

    }

    private void playAnimalSounds() {

        for(int i = 0; i< animalSetInTheYard.length;i++) {
            if(animalSetInTheYard[i]!=null) {
                animalSetInTheYard[i].move();
                animalSetInTheYard[i].sound();
            }
        }

    }


    public static void main(String[] args) {
        AnimalYard ay = new AnimalYard();
        ay.addAnimals();
        ay.playAnimalSounds();

    }
}
