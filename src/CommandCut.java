public class CommandCut implements Command {
    @Override
    public Object process(Object input) {

        System.out.println("byxorna har klippts.");
        return input;
    }
}
