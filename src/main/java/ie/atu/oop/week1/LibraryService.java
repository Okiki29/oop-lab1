package ie.atu.oop.week1;

public class LibraryService {
    private static final int MAX_LOAN_DAYS = 14;

    public void loanBook(Book book, int loandays)
    {
        if(book == null)
        {
            throw new IllegalArgumentException("Book cannot be null");
        }
        if(loandays < 1 || loandays > MAX_LOAN_DAYS)
        {
            throw new IllegalArgumentException("Loan days must be between 1 and 14");
        }
        book.borrowBook();
    }
}
