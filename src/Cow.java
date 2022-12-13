public class Cow extends Animal {

    @Override
    void sound() {

        System.out.println("mugeste vaca");
        SoundOfAnimals.soundOfAnimal("cow.mp3");
    }
}
