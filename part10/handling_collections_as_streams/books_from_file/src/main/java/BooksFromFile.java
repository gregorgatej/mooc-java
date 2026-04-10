import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class BooksFromFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookCsv = scanner.nextLine();
        List<Book> books = readBooks(bookCsv);
        books.stream()
                .forEach(book -> System.out.println(book));
    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();

        try {
            Files.lines(Paths.get("part10//handling_collections_as_streams/books_from_file/src/main/resources/" + file))
                    .map(row -> row.split(","))
                    .filter(row -> row.length == 4)
                    .map(row -> new Book(row[0], Integer.valueOf(row[1]), Integer.valueOf(row[2]), row[3]))
                    .forEach(book -> books.add(book));
        } catch (Exception e) {
            System.out.println("Error when processing file: " + e.getMessage());
        }

        return books;
    }
}