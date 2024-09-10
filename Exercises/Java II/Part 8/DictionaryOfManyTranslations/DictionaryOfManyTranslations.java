import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> translations = this.dictionary.get(word);
        translations.add(translation);
    }

    public ArrayList<String> translate(String word) {
        for (String searchTerm: this.dictionary.keySet()) {
            if (searchTerm.equals(word)) {
                return (this.dictionary.get(word));
            }
        }
        return new ArrayList<>();
    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
