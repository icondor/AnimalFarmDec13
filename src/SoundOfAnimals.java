import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class SoundOfAnimals {


    public static void soundOfAnimal(String fileNameContainingSound) {

        try {
            // primeste numele unui mp3 de pe disk
            FileInputStream fos = new FileInputStream(fileNameContainingSound);
            BufferedInputStream bof = new BufferedInputStream(fos);

            // play that file
            Player player = new Player(fos);
            player.play();
            //System.out.println("ruleaza");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        SoundOfAnimals.soundOfAnimal("dog.mp3");
    }
}
