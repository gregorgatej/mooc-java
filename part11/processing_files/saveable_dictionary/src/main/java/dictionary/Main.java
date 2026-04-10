package dictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");

        if (dictionary.load()) {
            System.out.println("Successfully loaded the dictionary from file");
            System.out.println(dictionary.translate("apina"));
            System.out.println(dictionary.translate("ohjelmointi"));
            System.out.println(dictionary.translate("alla oleva"));
        } else {
            System.out.println("File didn't load");
        }

        System.out.println("--------");

        dictionary.add("talo", "house");
        dictionary.add("vesi", "water");

        System.out.println(dictionary.translate("house"));

        System.out.println("--------");

        if (dictionary.save()) {
            System.out.println("Successfully saved the dictionary to file");
        } else {
            System.out.println("File wasn't saved");
        }

        System.out.println("--------");

        if (dictionary.load()) {
            System.out.println("Successfully loaded the dictionary from file");
            System.out.println(dictionary.translate("water"));
            System.out.println(dictionary.translate("ohjelmointi"));
            System.out.println(dictionary.translate("vesi"));
        } else {
            System.out.println("File didn't load");
        }
    }
}
