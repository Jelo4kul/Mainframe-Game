package mainframeGame;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Jelo
 */
public class MusicEngine {

    public static void main(String[] args) throws Exception {
        new MusicEngine().play();

    }

    public void play() {

        try {
            URL musicUrl = this.getClass().getResource("jack_in_the_box.wav");
            //opens an audio input stream from the url provided
            AudioInputStream audInpStream = AudioSystem.getAudioInputStream(musicUrl);

            //returns a clip that can be used to play an audio stream
            Clip clip = AudioSystem.getClip();
            clip.open(audInpStream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);

            //this enables the music to be played for the duration of the song
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
