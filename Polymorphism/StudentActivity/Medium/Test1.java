class Book {
    void showType() {
        System.out.println("Book type");
    }
}

class Fiction extends Book {
    void showType() {
        System.out.println("This is a Fiction book");
    }
}

class Science extends Book {
    void showType() {
        System.out.println("This is a Science book");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Book b1 = new Fiction();
        Book b2 = new Science();
        b1.showType();
        b2.showType();
    }
}
