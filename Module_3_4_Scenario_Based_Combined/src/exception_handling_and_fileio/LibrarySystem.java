package exception_handling_and_fileio;
class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

public class LibrarySystem {
    static void loanBook(String book, int stock) throws BookNotAvailableException {
        if (stock <= 0) {
            throw new BookNotAvailableException(book + " is out of stock.");
        }
        System.out.println("Loan approved for: " + book);
    }

    public static void main(String[] args) {
        try {
            loanBook("Java Basics", 2);
            loanBook("Advanced Java", 0);
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}