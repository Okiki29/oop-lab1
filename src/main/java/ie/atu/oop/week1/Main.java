package ie.atu.oop.week1;

public class Main {
    public static void main(String[] args)
    {
        try {
            Book myBook = new Book("Dune", "Frank", 10);
            LibraryService service = new LibraryService();
            System.out.println("Creating a new book");
            System.out.println(myBook.getStatus());
            myBook.borrowBook();
            System.out.println(myBook.getStatus());
            myBook.returnBook();
            System.out.println(myBook.getStatus());

            service.loanBook(myBook, 14);
            System.out.println(myBook.getStatus());
        } catch(IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }

    }


}
