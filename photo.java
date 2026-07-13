interface Camera {
    void clickPhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Mobile implements Camera, MusicPlayer {

    public void clickPhoto() {
        System.out.println("Photo clicked");
    }

    public void playMusic() {
        System.out.println("Music is playing");
    }
}

public class photo {
    public static void main(String[] args) {
        Mobile m= new Mobile();

        m.clickPhoto();
        m.playMusic();
    }
}