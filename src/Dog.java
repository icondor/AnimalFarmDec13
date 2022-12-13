public  class Dog extends Animal{

    @Override
     void sound() {

        System.out.println("latra caine");
        SoundOfAnimals.soundOfAnimal("dog.mp3");
     }
}
