package Test;
import Classes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testNotNull(){
        Library library1 = new Library();
        assertNotNull(library1.getCollection());
    }

    @Test
    public void testSizeList(){
        Library library1 = new Library();
        Book b1 = new Book("The little prince");
        Book b2 = new Book("Godzilla");
        library1.addBooks(b1);
        library1.addBooks(b2);
        assertEquals(2, library1.getCollection().size());
    }

    @Test
    public void testFindBook(){
        Library library1 = new Library();
        Book b1 = new Book("The little prince");
        Book b2 = new Book("Godzilla");
        library1.addBooks(b1);
        library1.addBooks(b2);
        assertEquals(b1, library1.getPosition(1));
    }

    @Test
    public void testNotDuplicates(){
        int counter = 0;
        Library library1 = new Library();
        Book b1 = new Book("The little prince");
        Book b2 = new Book("Godzilla");
        Book b3 = new Book("1980");
        library1.addBooks(b1);
        library1.addBooks(b2);
        library1.addBooks(b3);

        for(Book book : library1.getCollection()){
            if(book.getTitle().equalsIgnoreCase(b1.getTitle())){
                counter++;
            }
        }
        assertEquals(1, counter, library1.getCollection().toString());
    }

    @Test
    public void recuperateBookByPosition(){
        Library library1 = new Library();
        Book b1 = new Book("The little prince");
        Book b2 = new Book("Godzilla");
        library1.addBooks(b1);
        library1.addBooks(b2);
        assertEquals(b2, library1.getPosition(0), "The first book should be Godzilla.");
        assertEquals(b1, library1.getPosition(1), "The second book should be The little prince.");

    }

    @Test
    public void addBookAtPosition() {
        Library library1 = new Library();
        Book b1 = new Book("The little prince");
        Book b2 = new Book("Godzilla");
        Book b3 = new Book("The strongest fighter");
        library1.addBooks(b1);
        library1.addBooks(b2);

        library1.addBookByPosition(0,b3);

        assertEquals(b3, library1.getPosition(0), "The first book should be The strongest fighter.");
        assertEquals(b2, library1.getPosition(1), "The second book should be Godzilla.");
    }

    @Test
    public void removeBook(){
        Library library1 = new Library();
        Book b1 = new Book("The little prince");
        Book b2 = new Book("Godzilla");
        Book b3 = new Book("The strongest fighter");
        library1.addBooks(b1);
        library1.addBooks(b2);
        library1.addBooks(b3);

        assertEquals(b1,library1.getPosition(1), "The first book should be Godzilla.");
        assertEquals(b2,library1.getPosition(0), "The second book should be The little prince.");
        assertEquals(b3,library1.getPosition(2), "The third book should be The strongest fighter.");

        library1.removeBook(b2);

        library1.showBookList();
    }
}
