import BusinessObjects.TShirt;

public class TShirtBuilder {

    private TShirt tshirt = new TShirt();

    public TShirtBuilder setSize(String size) {
        tshirt.setSize(size);
        return this;
    }
    public TShirtBuilder setMaterial(String material) {
        tshirt.setMaterial(material);
        return this;
    }
    public TShirtBuilder setColor(String color) {
        tshirt.setColor(color);
        return this;
    }

    public TShirt build() {
        return tshirt;
    }
}
