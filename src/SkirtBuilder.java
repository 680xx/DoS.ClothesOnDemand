import BusinessObjects.Skirt;

public class SkirtBuilder {

    private Skirt skirt = new Skirt();

    public SkirtBuilder setSize(String size) {
        skirt.setSize(size);
        return this;
    }
    public SkirtBuilder setMaterial(String material) {
        skirt.setMaterial(material);
        return this;
    }
    public SkirtBuilder setColor(String color) {
        skirt.setColor(color);
        return this;
    }

    public Skirt build() {
        return skirt;
    }
}
