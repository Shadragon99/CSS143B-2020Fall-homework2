package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.rating = rating;
        this.title = title;
        this.id = UUID.randomUUID();
        // homework
    }

    public Movie(Movie anotherMovie) {
        // homework
        this.rating = anotherMovie.rating;
        this.title = anotherMovie.title;
        this.id = anotherMovie.id;
    }

    public Movie() {

    }

    @Override
    public boolean equals(Object obj) {
        // homework
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Movie)){
            return false;
        }
        Movie m1 = (Movie) obj;
        return (this.id == m1.id && this.title == m1.title && this.rating == m1.rating);
    }
}
