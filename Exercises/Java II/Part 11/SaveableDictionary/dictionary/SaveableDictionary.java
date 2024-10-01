package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();     // calling the contructor above
        this.file = file;
    }

    public void add(String words, String translation) {
        if(!dictionary.containsKey(words)) {
            dictionary.put(words, translation);
            dictionary.put(translation, words);
        }
    }

    public void delete(String word) {
        String trans = dictionary.get(word);
        dictionary.remove(trans);
        dictionary.remove(word);
    }

    public String translate(String word) {
        return dictionary.get(word);
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(this.file))
                                .map(line -> line.split(":"))
                                .forEach(parts -> {
                                    this.dictionary.put(parts[0], parts[1]);
                                    this.dictionary.put(parts[1], parts[0]);
                                });
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try  {
            PrintWriter writer = new PrintWriter(new File(file));
            saveWords(writer);
            writer.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    private void saveWords(PrintWriter writer) throws IOException {
        List<String> savedWord = new ArrayList<>();

        dictionary.keySet().stream().forEach(word -> {
            if(savedWord.contains(word)) return;
            
            String part = word + ":" + dictionary.get(word);
            writer.println(part);
    
            savedWord.add(word);
            savedWord.add(dictionary.get(word));
        });
    }
}
