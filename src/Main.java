import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Book> massive = new HashMap<>();
        BookImpl book = new BookImpl(massive);
        LOOPMAIN:
        while (true) {
            System.out.println("""
                    1.Display
                    2.Add book
                    3.Remove book
                    4.Search
                    """);
            try {
                int num = new Scanner(System.in).nextInt();
                switch (num) {
                    case 1 -> {
                        book.DisplayBooks();
                    }
                    case 2 -> {
                        Book book1 = new Book();
                        while (true){
                            System.out.println("Write ISBN: ");
                            String dd = new Scanner(System.in).nextLine();
                            if (dd.length()>5){
                                book1.setIsbn(dd);
                                break;
                            }
                        }while (true){
                            System.out.println("Write autor name: ");
                            String dd = new Scanner(System.in).nextLine();
                            if (dd.length()>5){
                                book1.setAuthor(dd);
                                break;
                            }
                        }while (true){
                            System.out.println("Write Title: ");
                            String dd = new Scanner(System.in).nextLine();
                            if (dd.length()>5){
                                book1.setTitle(dd);
                                break;
                            }
                        }

                        book.addbook(book1);
                    }case 3->{
                        System.out.println("Write ISBN book: ");
                        System.out.println(book.remove(new Scanner(System.in).nextLine()));
                    }case 4->{
                        System.out.println("Write ISBN: ");
                        System.out.println(book.search(new Scanner(System.in).nextLine()));
                    }case 0->{
                        break LOOPMAIN;
                    }
                }
            }catch (InputMismatchException exception){
                System.out.println("San jaz!");
            }
        }
    }
}