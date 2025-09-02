abstract class Device {
    abstract void specifications();
}

class Laptop extends Device {
    void specifications() {
        System.out.println("Laptop: Intel i7, 16GB RAM, 512GB SSD");
    }
}

class Mobile extends Device {
    void specifications() {
        System.out.println("Mobile: Snapdragon 888, 8GB RAM, 128GB Storage");
    }
}

public class Test10 {
    public static void main(String[] args) {
        Device d1 = new Laptop();
        Device d2 = new Mobile();
        d1.specifications();
        d2.specifications();
    }
}
