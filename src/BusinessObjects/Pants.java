package BusinessObjects;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Pants {

    // Attributes
    private int id;
    private String name;
    private String size;                    // medium, large
    private int price;                      // 499 kr - 799 kr
    private String material;                // jeans, tyg
    private String color;                   // svart, blå
    private String fit;                     // regular fit, slim fit, relaxed fit
    private String length;                  // shorts, trekvarts, standard
    private boolean workStarted = false;
    private boolean workCompleted = false;
    private PropertyChangeSupport propertyChangeSupport;

    // Constructors
    public Pants() {
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

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
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
        return "Pants{" + "id=" + id + ", name='" + name + '\'' + ", size='" + size + '\'' + ", price=" + price + ", material='" + material + '\'' + ", color='" + color + '\'' + ", fit='" + fit + '\'' + ", length='" + length + '\'' + '}';
    }
}
