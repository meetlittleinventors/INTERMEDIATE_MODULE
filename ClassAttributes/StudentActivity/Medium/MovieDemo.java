class Movie {
    String title;
    double rating;
}

public class MovieDemo {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.title = "Inception";
        m1.rating = 8.8;

        Movie m2 = new Movie();
        m2.title = "Interstellar";
        m2.rating = 9.0;

        System.out.println(m1.title + " Rating: " + m1.rating);
        System.out.println(m2.title + " Rating: " + m2.rating);

        if (m1.rating > m2.rating) {
            System.out.println(m1.title + " has a higher rating.");
        } else {
            System.out.println(m2.title + " has a higher rating.");
        }
    }
}
