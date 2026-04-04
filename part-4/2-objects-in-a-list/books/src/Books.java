import java.util.Scanner;
import java.util.ArrayList;

public class Books {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Books app = new Books();
        app.setBookList();
        app.printBookList();
    }

    private void setBookList() {
        while (true) {
            System.out.println("Enter title:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Year:");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }
    }

    private void printBookList() {
        while (true) {
            System.out.println("What information should be printed?");
            String msg = scanner.nextLine();
            if (msg.equals("everything") || msg.equals("title")) {
                printBooks(msg);
                break;
            }
            System.out.println("Try to input something different...");
        }
    }

    private void printBooks(String msg) {
        if (msg.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (msg.equals("title")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
