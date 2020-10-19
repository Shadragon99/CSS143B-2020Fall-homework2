package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        // homework
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.id = anotherBook.id;
    }

    public Book() {

    }


    @Override
    public boolean equals(Object obj) { //had help from https://www.geeksforgeeks.org/overriding-equals-method-in-java/
        // homework
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Book)){
            return false;
        }
        Book b1 = (Book) obj;
        return (this.id == b1.id && this.author == b1.author && this.title == b1.title);
    }
}
