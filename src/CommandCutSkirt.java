import BusinessObjects.Skirt;

public class CommandCutSkirt implements Command {

    private final Skirt skirt;
    private final String cut;

    public CommandCutSkirt(Skirt skirt, String cut) {
        this.skirt = skirt;
        this.cut = cut;
    }

    @Override
    public void execute() {
        skirt.setWaistline(cut);
        System.out.println("Midjan anpassas.");

    }
}
