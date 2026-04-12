package application;

import java.sql.SQLException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws SQLException {
        String databasePath = "jdbc:h2:./todo-database";
        if (args.length > 0) {
            databasePath = args[0];
        }
        application.TodoDao database = new application.TodoDao(databasePath);
        Scanner scanner = new Scanner(System.in);

        new application.UserInterface(scanner, database).start();
    }
}
