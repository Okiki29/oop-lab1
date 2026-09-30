package ie.atu.oop.week1;

public class Main {
    public static void main(String[] args)
    {
        try {
            Book myBook = new Book("Dune", "Frank", 10);
            System.out.println("Creating a new book");
        } catch(IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }

    }


}
