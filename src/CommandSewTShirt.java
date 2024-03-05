import BusinessObjects.TShirt;

public class CommandSewTShirt implements Command {

    private final TShirt tshirt;
    private final String sew;

    public CommandSewTShirt(TShirt tshirt, String sew) {
        this.tshirt = tshirt;
        this.sew = sew;
    }

    @Override
    public void execute() {
        tshirt.setSleeves(sew);
        System.out.println("\nArmlängden sys.");

    }
}
