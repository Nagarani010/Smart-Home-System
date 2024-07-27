public class Configurationmanager {
    private static Configurationmanager instance;

    private String configuration;

    private Configurationmanager() {
        // Private constructor to prevent instantiation
        configuration = "Default Configuration";
    }

    public static synchronized Configurationmanager getInstance() {
        if (instance == null) {
            instance = new Configurationmanager();
        }
        return instance;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}
