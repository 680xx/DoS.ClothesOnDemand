package BusinessObjects;

public class TShirt {

    // Attributes
    private int id;
    private String name;
    private String size;                // medium, large
    private int price;                  // 199 kr - 349 kr
    private String material;            // bomull, polyester
    private String color;               // grå, röd
    private String sleeves;             // kortärmad, långärmad, linne
    private String neck;                // v-ringad, rundhalsad, polo

    // Constructors
    public TShirt() {
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

    @Override
    public String toString() {
        return "TShirt{" + "id=" + id + ", name='" + name + '\'' + ", size='" + size + '\'' + ", price=" + price + ", material='" + material + '\'' + ", color='" + color + '\'' + ", sleeves='" + sleeves + '\'' + ", neck='" + neck + '\'' + '}';
    }
}
