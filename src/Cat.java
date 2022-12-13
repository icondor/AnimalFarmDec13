public class Cat extends Animal {

    @Override
    void sound() {

        System.out.println("miauna pisica");
        SoundOfAnimals.soundOfAnimal("cat.mp3");
    }

    @Override
    public void move() {
        System.out.println("asta e matza, se misca altfel fata de caine si de vaca ");
    }
}
