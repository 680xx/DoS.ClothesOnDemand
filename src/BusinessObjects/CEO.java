package BusinessObjects;

public class CEO {

    // Attributes
    private int id = 1;
    private static String name = "Tomas Wigell";

    // Constructors
    public CEO() {
    }

    // Getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
