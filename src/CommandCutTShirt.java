import BusinessObjects.TShirt;

public class CommandCutTShirt implements Command {

    private final TShirt tshirt;
    private final String cut;

    public CommandCutTShirt(TShirt tshirt, String cut) {
        this.tshirt = tshirt;
        this.cut = cut;
    }

    @Override
    public void execute() {
        tshirt.setNeck(cut);
        System.out.println("Nacken anpassas.");

    }
}
