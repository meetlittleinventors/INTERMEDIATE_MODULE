abstract class Player {
    abstract void play();
}

class CricketPlayer extends Player {
    void play() {
        System.out.println("Cricket Player is batting");
    }
}

class FootballPlayer extends Player {
    void play() {
        System.out.println("Football Player is kicking the ball");
    }
}

public class Test8 {
    public static void main(String[] args) {
        Player p1 = new CricketPlayer();
        Player p2 = new FootballPlayer();
        p1.play();
        p2.play();
    }
}
