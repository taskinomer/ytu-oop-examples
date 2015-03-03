package tr.edu.yildiz.oop.example.phone;

public class Application {

    private String applicationName;

    public Application() {

    }

    public Application(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
}
