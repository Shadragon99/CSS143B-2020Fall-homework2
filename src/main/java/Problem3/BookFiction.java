package Problem3;

import java.util.UUID;

public class BookFiction extends Book {

    private int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        super();
        // homework
        // tip: use the 'super' keyword
        super.title = title;
        super.author = author;
        this.genres = genres;
        super.id = UUID.randomUUID();
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        super();
        // homework
        // tip: use the 'super' keyword
        super.title = anotherBook.title;
        super.author = anotherBook.author;
        super.id = anotherBook.id;
        this.genres = anotherBook.genres;
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
