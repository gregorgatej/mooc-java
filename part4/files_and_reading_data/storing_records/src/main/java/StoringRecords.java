import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        if (records == null) {
            System.out.println("Terminating program...");
            return;
        }

        System.out.println("Nr. of persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);
        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        String filepath = "part4/files_and_reading_data/storing_records/src/main/resources/" + file;

        try (Scanner scanner = new Scanner(Paths.get(filepath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                persons.add(new Person(name, age));
            }
        } catch (Exception error) {
            System.out.println("Error reading file: " + error.getMessage());
            return null;
        }
        return persons;
    }
}