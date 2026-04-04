import java.util.Scanner;
import java.nio.file.Paths;

class FilePrinter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("part-4/3-files-and-reading-data/printing-a-file/data.txt"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}