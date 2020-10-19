package Problem3;

import java.util.UUID;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super();
        super.rating = rating;
        super.title = title;
        super.id = UUID.randomUUID();
    }

    public MovieAction(MovieAction anotherMovie) {
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
        // homework
        if (numOfDaysPastDue >= 5){
            return 2 * numOfDaysPastDue * getLateFeeInDollar();
        }else if (numOfDaysPastDue <= 0) {
            return 0;
        }else{
            return numOfDaysPastDue * getLateFeeInDollar();
        }
    }
}
