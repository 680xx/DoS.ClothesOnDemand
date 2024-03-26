import BusinessObjects.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderController {

    public OrderController () {
    }

    private static ArrayList<Object> orderList = new ArrayList<>();


    public void builderPattern(Menu menu) {

        List<Command> commandPipeline = new ArrayList<>();

        if (Objects.equals(menu.getClothing(), "byxa")) {    // Patterns for trousers
            Pants pants = new Pants();
            PantsObserver pantsObserver = new PantsObserver();
            pants.addPropertyChangeListener(pantsObserver);
            pants.setWorkStarted(true);
            PantsBuilder builder = new PantsBuilder();
            pants = builder
                    .setMaterial(menu.getClothingOption1())
                    .setSize(menu.getClothingOption2())
                    .setColor(menu.getClothingOption3())
                    .build();

                    pants.addPropertyChangeListener(pantsObserver);
                    pants.setId(orderList.size()+1);
                    pants.setName(menu.getClothing());
                    pants.setPrice(menu.getClothingPrice());

            if (Objects.equals(menu.getClothingOption4(), "regular")) {
                commandPipeline.add(new CommandSewPants(pants, "regular fit"));
            } else if (Objects.equals(menu.getClothingOption4(), "slim")) {
                commandPipeline.add(new CommandSewPants(pants, "slim fit"));
            } else {
                commandPipeline.add(new CommandSewPants(pants, "relaxed fit"));
            }

            if (Objects.equals(menu.getClothingOption5(), "shorts")) {
                commandPipeline.add(new CommandCutPants(pants, "shorts"));
            } else if (Objects.equals(menu.getClothingOption5(), "trekvarts")) {
                commandPipeline.add(new CommandCutPants(pants, "trekvarts"));
            } else {
                commandPipeline.add(new CommandCutPants(pants, "Standard"));
            }

            CommandInvoker commandInvoker = new CommandInvoker();
            for (Command command : commandPipeline) {
                commandInvoker.executeCommand(command);
            }

                    pants.setWorkCompleted(true);
                    orderList.add(pants);


        } else if (Objects.equals(menu.getClothing(), "tröja")) {    // Patterns for TShirt
            TShirt tshirt = new TShirt();
            TShirtObserver tshirtObserver = new TShirtObserver();
            tshirt.addPropertyChangeListener(tshirtObserver);
            tshirt.setWorkStarted(true);

            TShirtBuilder builder = new TShirtBuilder();
            tshirt = builder
                    .setMaterial(menu.getClothingOption1())
                    .setSize(menu.getClothingOption2())
                    .setColor(menu.getClothingOption3())
                    .build();

                    tshirt.addPropertyChangeListener(tshirtObserver);
                    tshirt.setId(orderList.size()+1);
                    tshirt.setName(menu.getClothing());
                    tshirt.setPrice(menu.getClothingPrice());

            if (Objects.equals(menu.getClothingOption4(), "v-ringad")) {
                commandPipeline.add(new CommandSewTShirt(tshirt, "v-ringad"));
            } else if (Objects.equals(menu.getClothingOption4(), "rundhalsad")) {
                commandPipeline.add(new CommandSewTShirt(tshirt, "rundhalsad"));
            } else {
                commandPipeline.add(new CommandSewTShirt(tshirt, "polo"));
            }

            if (Objects.equals(menu.getClothingOption5(), "kortärmad")) {
                commandPipeline.add(new CommandCutTShirt(tshirt, "kortärmad"));
            } else if (Objects.equals(menu.getClothingOption5(), "långärmad")) {
                commandPipeline.add(new CommandCutTShirt(tshirt, "långärmad"));
            } else {
                commandPipeline.add(new CommandCutTShirt(tshirt, "linne"));
            }

            CommandInvoker commandInvoker = new CommandInvoker();
            for (Command command : commandPipeline) {
                commandInvoker.executeCommand(command);
            }

                    tshirt.setWorkCompleted(true);
                    orderList.add(tshirt);


        } else {        // Patterns for Skirt
            Skirt skirt = new Skirt();
            SkirtObserver skirtObserver = new SkirtObserver();
            skirt.addPropertyChangeListener(skirtObserver);
            skirt.setWorkStarted(true);

            SkirtBuilder builder = new SkirtBuilder();
            skirt = builder
                    .setMaterial(menu.getClothingOption1())
                    .setSize(menu.getClothingOption2())
                    .setColor(menu.getClothingOption3())
                    .build();

                    skirt.addPropertyChangeListener(skirtObserver);
                    skirt.setId(orderList.size()+1);
                    skirt.setName(menu.getClothing());
                    skirt.setPrice(menu.getClothingPrice());

            if (Objects.equals(menu.getClothingOption4(), "låg midja")) {
                commandPipeline.add(new CommandSewSkirt(skirt, "låg midja"));
            } else if (Objects.equals(menu.getClothingOption4(), "standard midja")) {
                commandPipeline.add(new CommandSewSkirt(skirt, "standard midja"));
            } else {
                commandPipeline.add(new CommandSewSkirt(skirt, "hög midja"));
            }

            if (Objects.equals(menu.getClothingOption5(), "rak")) {
                commandPipeline.add(new CommandCutSkirt(skirt, "rak"));
            } else if (Objects.equals(menu.getClothingOption5(), "a-linje")) {
                commandPipeline.add(new CommandCutSkirt(skirt, "a-linje"));
            } else {
                commandPipeline.add(new CommandCutSkirt(skirt, "volang"));
            }

            CommandInvoker commandInvoker = new CommandInvoker();
            for (Command command : commandPipeline) {
                commandInvoker.executeCommand(command);
            }

                    skirt.setWorkCompleted(true);
                    orderList.add(skirt);
        }
    }


    public void commandPattern() {

    }

    public static ArrayList getOrderList() {
        return orderList;
    }

}
