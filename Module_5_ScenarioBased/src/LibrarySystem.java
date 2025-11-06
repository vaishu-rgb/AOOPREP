
import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class Book {
    final String id;
    final String title;
    final String author;
    boolean isAvailable;

    Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
}

class Member {
    final String memberId;
    final String name;
    final List<Book> borrowedBooks = new ArrayList<>();

    Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }
}


class Library {
    private final Map<String, Book> catalog = new HashMap<>();
    private final Map<String, Member> members = new HashMap<>();


    void addBook(Book book) {
        catalog.put(book.id, book);
    }

    Book getBook(String bookId) {
        return catalog.get(bookId);
    }


    void registerMember(Member member) {
        members.put(member.memberId, member);
    }

    Member getMember(String memberId) {
        return members.get(memberId);
    }


    boolean borrowBook(String memberId, String bookId) {
        Member member = members.get(memberId);
        Book book = catalog.get(bookId);
        if (member != null && book != null && book.isAvailable) {
            book.isAvailable = false;
            member.borrowedBooks.add(book);
            return true;
        }
        return false;
    }

    boolean returnBook(String memberId, String bookId) {
        Member member = members.get(memberId);
        Book book = catalog.get(bookId);
        if (member != null && book != null && member.borrowedBooks.contains(book)) {
            book.isAvailable = true;
            member.borrowedBooks.remove(book);
            return true;
        }
        return false;
    }


    int totalBooks() {
        return catalog.size();
    }

    int availableBooks() {
        return (int) catalog.values().stream().filter(b -> b.isAvailable).count();
    }
}


class LibrarySystemTest {
    Library library;
    Book book1, book2;
    Member member1;

    @BeforeEach
    void setup() {
        library = new Library();
        book1 = new Book("B001", "Effective Java", "Joshua Bloch");
        book2 = new Book("B002", "Clean Code", "Robert C. Martin");
        member1 = new Member("M001", "Alice");

        library.addBook(book1);
        library.addBook(book2);
        library.registerMember(member1);
    }

    @Test
    void testAddAndGetBook() {
        assertEquals("Effective Java", library.getBook("B001").title);
    }

    @Test
    void testRegisterAndGetMember() {
        assertEquals("Alice", library.getMember("M001").name);
    }

    @Test
    void testBorrowBookSuccess() {
        assertTrue(library.borrowBook("M001", "B001"));
        assertFalse(book1.isAvailable);
        assertEquals(1, member1.borrowedBooks.size());
    }

    @Test
    void testBorrowBookFailure() {
        library.borrowBook("M001", "B001");
        assertFalse(library.borrowBook("M001", "B001")); // Already borrowed
    }

    @Test
    void testReturnBookSuccess() {
        library.borrowBook("M001", "B001");
        assertTrue(library.returnBook("M001", "B001"));
        assertTrue(book1.isAvailable);
        assertEquals(0, member1.borrowedBooks.size());
    }

    @Test
    void testReturnBookFailure() {
        assertFalse(library.returnBook("M001", "B001")); // Not borrowed yet
    }

    @Test
    void testInventoryCounts() {
        assertEquals(2, library.totalBooks());
        library.borrowBook("M001", "B001");
        assertEquals(1, library.availableBooks());
    }
}