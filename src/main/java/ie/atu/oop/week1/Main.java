package ie.atu.oop.week1;

public class Main {
    public static void main(String[] args) {

        Book mybook = new Book("Dune", "Frank Herbert", 412);

        Book mybook2 = new Book("Clean Code", "Robert C. Martin", 464);

        LibraryService service = new LibraryService();

        System.out.println(mybook.getStatus());

        service.loanBook(mybook, 7);
        System.out.println(mybook.getStatus());

        service.returnBook(mybook);
        System.out.println(mybook.getStatus());
        System.out.println(mybook2.getStatus());
        try {
            service.loanBook(mybook, 15);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(mybook.getStatus());
    }
}

