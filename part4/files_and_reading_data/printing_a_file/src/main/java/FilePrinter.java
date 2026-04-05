import java.util.Scanner;
import java.nio.file.Paths;

class FilePrinter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("part4/files_and_reading_data/printing_a_file/src/main/resources/data.txt"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}