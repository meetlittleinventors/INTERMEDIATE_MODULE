class Book {
    void read() {
        System.out.println("Reading a physical book");
    }
}

class EBook extends Book {
    void download() {
        System.out.println("Downloading an eBook");
    }
}

class AudioBook extends EBook {
    void listen() {
        System.out.println("Listening to an AudioBook");
    }
}

public class Test {
    public static void main(String[] args) {
        AudioBook a = new AudioBook();
        a.read();      // from Book
        a.download();  // from EBook
        a.listen();    // from AudioBook
    }
}
