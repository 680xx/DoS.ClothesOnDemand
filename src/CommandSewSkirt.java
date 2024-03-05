import BusinessObjects.Skirt;

public class CommandSewSkirt implements Command {

    private final Skirt skirt;
    private final String sew;

    public CommandSewSkirt(Skirt skirt, String sew) {
        this.skirt = skirt;
        this.sew = sew;
    }

    @Override
    public void execute() {
        skirt.setPattern(sew);
        System.out.println("\nKjolstilen sys.");

    }
}
