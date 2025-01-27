package Classes;
import java.util.ArrayList;
import java.util.Comparator;

public class Library {

    private static ArrayList<Book> collection;

    public Library(){
        collection = new ArrayList<Book>();
    }

    public ArrayList<Book> getCollection(){
        return new ArrayList<Book>(collection);
    }

    public void addBooks(Book book){

        collection.add(book);
        collection.sort(Comparator.comparing(Book::getTitle));
    }

    public Book getPosition(int position){
        if(position >= 0 && position < collection.size()){
            return collection.get(position);
        } else {
            throw new IndexOutOfBoundsException("There's not a book in that position.");
        }
    }

   public void addBookByPosition(int position, Book book){
        collection.add(position,book);
   }

    public String showBookList(){
        return collection.toString();

    }

    public void removeBook(Book book){
        collection.remove(book);
        collection.sort(Comparator.comparing(Book::getTitle));
    }

    public String toString(){
        return "Books: " + collection;
    }

}
