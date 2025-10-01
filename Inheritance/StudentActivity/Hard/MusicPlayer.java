interface Playable {
    void play();
}

interface Recordable {
    void record();
}

class MusicPlayer implements Playable, Recordable {
    public void play() {
        System.out.println("Playing music...");
    }
    public void record() {
        System.out.println("Recording music...");
    }
}

public class Main {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.play();
        mp.record();
    }
}
