package app;

import javafx.application.Application;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a title for the app:");
        String title = scanner.nextLine();
        
        Application.launch(App.class,
                "--title=" + title);
    }
}