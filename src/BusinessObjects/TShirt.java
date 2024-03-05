package BusinessObjects;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TShirt {

    // Attributes
    private int id;
    private String name;
    private String size;                         // medium, large
    private int price;                           // 199 kr - 349 kr
    private String material;                     // bomull, polyester
    private String color;                        // grå, röd
    private String sleeves;                      // kortärmad, långärmad, linne
    private String neck;                         // v-ringad, rundhalsad, polo
    private boolean workStarted = false;
    private boolean workCompleted = false;
    private PropertyChangeSupport propertyChangeSupport;

    // Constructors
    public TShirt() {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    // Getter & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSleeves() {
        return sleeves;
    }

    public void setSleeves(String sleeves) {
        this.sleeves = sleeves;
    }

    public String getNeck() {
        return neck;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }

    public boolean isWorkStarted() {
        return workStarted;
    }

    public void setWorkStarted(boolean workStarted) {
        boolean oldWorkStarted = this.workStarted;
        this.workStarted = workStarted;

        this.propertyChangeSupport.firePropertyChange("plagg tillverkas", oldWorkStarted, this.workStarted);
    }

    public boolean isWorkCompleted() {
        return workCompleted;
    }

    public void setWorkCompleted(boolean workCompleted) {
        boolean oldWorkCompleted = this.workCompleted;
        this.workCompleted = workCompleted;

        this.propertyChangeSupport.firePropertyChange("plagg är klar", oldWorkCompleted, this.workCompleted);
    }

    @Override
    public String toString() {
        return "TShirt{" + "id=" + id + ", name='" + name + '\'' + ", size='" + size + '\'' + ", price=" + price + ", material='" + material + '\'' + ", color='" + color + '\'' + ", sleeves='" + sleeves + '\'' + ", neck='" + neck + '\'' + '}';
    }
}
