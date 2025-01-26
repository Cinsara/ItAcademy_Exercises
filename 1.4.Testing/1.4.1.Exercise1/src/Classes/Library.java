package Classes;
import java.util.ArrayList;

public class Library {

    private static ArrayList<Book> collection;

    public Library(){
        collection = new ArrayList<Book>();
    }

    public ArrayList<Book> getCollection(){
        return new ArrayList<Book>(collection);
    }

    public void addBooks(Book book){
        boolean exists = false;

        for(Book b : collection){
            if(b.title.equalsIgnoreCase(book.title)){
                exists = true;
                break;
            }
        }

        if(!exists){
            collection.add(book);
            collection.sort(null);
        }
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

        boolean exists = false;

        for(Book b : collection){
            if(b.title.equalsIgnoreCase(book.title)){
                exists = true;
                break;
            }
        }

        if(exists){
            collection.remove(book);
            collection.sort(null);
        }
    }

    public String toString(){
        return "Books: " + collection;
    }

}
