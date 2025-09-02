class Movie {
    private String name;
    private double rating;

    public void setDetails(String name, double rating) {
        this.name = name;
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Invalid Rating!");
        }
    }

    public void showDetails() {
        System.out.println("Movie: " + name + " | Rating: " + rating);
    }
}

public class Test4 {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.setDetails("Inception", 4.8);
        m.showDetails();

        m.setDetails("Unknown", 7.0); // invalid
    }
}
