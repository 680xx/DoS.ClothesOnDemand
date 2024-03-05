import BusinessObjects.Pants;

public class CommandCutPants implements Command {

    private final Pants pants;
    private final String cut;

    public CommandCutPants(Pants pants, String cut) {
        this.pants = pants;
        this.cut = cut;
    }

    @Override
    public void execute() {
        pants.setLength(cut);
        System.out.println("Byxorna klipps.");

    }
}
