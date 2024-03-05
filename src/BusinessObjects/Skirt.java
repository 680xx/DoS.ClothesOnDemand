package BusinessObjects;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Skirt {

    // Attributes
    private int id;
    private String name;
    private String size;                       // small, medium
    private int price;                         // 599 kr - 799 kr
    private String material;                   // jeans, skinn
    private String color;                      // svart, vit
    private String waistline;                  // låg midja, standard midja, hög midja
    private String pattern;                    // rak, a-linje, volang
    private boolean workStarted = false;
    private boolean workCompleted = false;
    private PropertyChangeSupport propertyChangeSupport;

    // Constructors
    public Skirt() {
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

    public String getWaistline() {
        return waistline;
    }

    public void setWaistline(String waistline) {
        this.waistline = waistline;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public boolean isWorkStarted() {
        return workStarted;
    }

    public void setWorkStarted(boolean workStarted) {
        boolean oldWorkStarted = this.workStarted;
        this.workStarted = workStarted;

        this.propertyChangeSupport.firePropertyChange("plagget har börjat tillverkas.", oldWorkStarted, this.workStarted);
    }

    public boolean isWorkCompleted() {
        return workCompleted;
    }

    public void setWorkCompleted(boolean workCompleted) {
        boolean oldWorkCompleted = this.workCompleted;
        this.workCompleted = workCompleted;

        this.propertyChangeSupport.firePropertyChange("plagget är klart", oldWorkCompleted, this.workCompleted);
    }

    @Override
    public String toString() {
        return "Skirt{" + "id=" + id + ", name='" + name + '\'' + ", size='" + size + '\'' + ", price=" + price + ", material='" + material + '\'' + ", color='" + color + '\'' + ", waistline='" + waistline + '\'' + ", pattern='" + pattern + '\'' + '}';
    }
}
