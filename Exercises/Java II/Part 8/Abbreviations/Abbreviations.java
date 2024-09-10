import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbrMap;

    public Abbreviations() {
        this.abbrMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = cleanString(abbreviation);
        if (hasAbbreviation(abbreviation)) {
            System.out.println("Abbreviation already present.");
        } else {
            abbrMap.put(abbreviation, explanation);
        }
    }

    private String cleanString(String abbreviation) {
        if (abbreviation == null) return "";

        return abbreviation.toLowerCase().trim();
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbrMap.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        if (hasAbbreviation(abbreviation)) {
            return abbrMap.get(abbreviation);
        }
        return null;
    }
}
