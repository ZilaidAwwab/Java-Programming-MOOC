public class Engine extends Part {
    private String engineType;

    public Engine(String engineType, String identifier, String manufacturer, String description) {
        /* Calling the constructor of the super class (Part class here) */
        super(identifier, manufacturer, description);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }
}

/*
 * We can use all the get methods defined in the super class on this class
 */
