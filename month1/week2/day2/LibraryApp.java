import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LibraryApp
{
    public static void main(String[] args)
    {
        ArrayList<Book> books = new ArrayList<>();
        Book b1 = new Book("Java Basics", "Ali Rezaei", 101);
        Book b2 = new Book("OOP Concepts", "Sara Ahmadi", 102);
        Book b3 = new Book("Data Structures", "Nima Kiani", 103);

        books.add(b1);
        books.add(b2);
        books.add(b3);

        for (Book book : books)
        {
            System.out.println(book);
        }

        User u1 = new User("Ahmad", 2);
        User u2 = new User("Mobina", 20);

        HashMap<User, ArrayList<Book>> borrowedBooks = new HashMap<>();
        borrowedBooks.put(u1, new ArrayList<>(List.of(b1, b2)));
        borrowedBooks.put(u2, new ArrayList<>(List.of(b3)));

        for (Map.Entry<User, ArrayList<Book>> entry : borrowedBooks.entrySet())
        {
            System.out.println("User: " + entry.getKey());
            for (Book book : books)
            {
                System.out.println(book);
            }
        }

    }
}
