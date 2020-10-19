package Problem3;

import java.util.UUID;

public class MovieComedy extends Movie {
    private int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super();
        super.rating = rating;
        super.title = title;
        super.id = UUID.randomUUID();
    }

    public MovieComedy(MovieComedy anotherMovie) {
        // homework
        // tip: use the 'super' keyword
        super();
        super.title = anotherMovie.title;
        super.rating = anotherMovie.rating;
        super.id = anotherMovie.id;
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {

        if (numOfDaysPastDue <=0){
            return 0;
        }else {
            return numOfDaysPastDue * getLateFeeInDollar();
        }

    }
}
