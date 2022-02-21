import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Sound {
    private Clip clip;
    private URL url;

    public Sound(String path) {
        initClip(path);
    }

    public void play(boolean fromStart) {
        if (fromStart) {
            clip.setFramePosition(0);
        }
        clip.start();
    }

    public void stop() {
        clip.stop();
    }

    private void initClip(String path) {
        url = Sound.class.getResource(path); //if loading from jar
        AudioInputStream inputStream;
        try {
            if (url == null) {
                path = path.substring(1);
                File file = new File(path);
                url = file.toURI().toURL(); //if executing on intelliJ
            }
            inputStream = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(inputStream);
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
