public interface FileServer {
    String load(String filename) throws Exception;    
    void save(String filename, String textToSave) throws Exception;    
}
