import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many random numbers?");
        int howMany = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < howMany; i++) {
            System.out.println(random.nextInt(11));
        }
    }
}