package ie.atu.oop.week1;

public class Main {
    public static void main(String[] args) {

        Book firstbook = new Book();
        firstbook.title = "Dune";
        firstbook.author = "Frank Herbert";
        firstbook.pageCount = 412;

        firstbook.displayDetails();
    }
}
