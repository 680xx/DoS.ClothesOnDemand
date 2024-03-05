import BusinessObjects.Pants;

public class CommandSewPants implements Command {

    private final Pants pants;
    private final String sew;

    public CommandSewPants(Pants pants, String sew) {
        this.pants = pants;
        this.sew = sew;
    }

    @Override
    public void execute() {
        pants.setFit(sew);
        System.out.println("\nByxorna sys.");

    }
}
