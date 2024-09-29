import java.util.HashMap;
import java.util.Map;

public class TextServer implements FileServer {
    private Map<String, String> data;

    public TextServer() {
        this.data = new HashMap<>();
    }

    @Override
    public String load(String filename) throws Exception {
        return this.data.get(filename);
    }

    @Override
    public void save(String filename, String textToSave) throws Exception {
        this.data.put(filename, textToSave);
    }
}
