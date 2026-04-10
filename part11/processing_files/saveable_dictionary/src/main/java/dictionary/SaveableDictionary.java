package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = "part11/processing_files/saveable_dictionary/src/main/resources/" + file;
    }

    public void add(String words, String translation) {
        dictionary.putIfAbsent(words, translation);
        dictionary.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        return dictionary.get(word);
    }

    public void delete(String word) {
        String secondKey = dictionary.get(word);

        dictionary.remove(word);
        dictionary.remove(secondKey);
    }

    public boolean load() {
        try (Stream<String> lines = Files.lines(Paths.get(this.file))) {
            lines
                    .map(line -> line.split(":"))
                    .forEach(pair -> {
                        dictionary.put(pair[0], pair[1]);
                        dictionary.put(pair[1], pair[0]);
                    });
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(new File(this.file))) {
            ArrayList<String> alreadyAdded = new ArrayList<>();

            for (String word : this.dictionary.keySet()) {
                if (alreadyAdded.contains(word)) {
                    continue;
                }

                String translation = this.dictionary.get(word);
                alreadyAdded.add(word);
                alreadyAdded.add(translation);

                writer.println(word + ":" + translation);
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}