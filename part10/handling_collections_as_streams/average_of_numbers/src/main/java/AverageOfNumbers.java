import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        double average;

        while (true) {
            String row = scanner.nextLine();

            if (row.equals("end")) break;

            inputs.add(Integer.valueOf(row));
        }

        average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println(average);
    }
}