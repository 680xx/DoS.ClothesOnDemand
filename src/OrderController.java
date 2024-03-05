import BusinessObjects.*;

import java.util.ArrayList;
import java.util.Objects;

public class OrderController {

    public OrderController () {
    }

    private static ArrayList<Object> orderList = new ArrayList<>();


    public void builderPattern(Menu menu) {

        if (Objects.equals(menu.getClothing(), "byxa")) {
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
                        Command pantsCommand = new CommandSewPants(pants, "regular fit");
                        new CommandInvoker().executeCommand(pantsCommand);
                    } else if (Objects.equals(menu.getClothingOption4(), "slim")) {
                        Command pantsCommand = new CommandSewPants(pants, "slim fit");
                        new CommandInvoker().executeCommand(pantsCommand);
                    } else {
                        Command pantsCommand = new CommandSewPants(pants, "relaxed fit");
                        new CommandInvoker().executeCommand(pantsCommand);
                    }
                    if (Objects.equals(menu.getClothingOption5(), "shorts")) {
                        Command pantsCommand = new CommandCutPants(pants, "shorts");
                        new CommandInvoker().executeCommand(pantsCommand);
                    } else if (Objects.equals(menu.getClothingOption5(), "trekvarts")) {
                        Command pantsCommand = new CommandCutPants(pants, "trekvarts");
                        new CommandInvoker().executeCommand(pantsCommand);
                    } else {
                        Command pantsCommand = new CommandCutPants(pants, "Standard");
                        new CommandInvoker().executeCommand(pantsCommand);
                    }
                    pants.setWorkCompleted(true);
                    orderList.add(pants);


        } else if (Objects.equals(menu.getClothing(), "tröja")) {
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
                        Command tshirtCommand = new CommandSewTShirt(tshirt, "v-ringad");
                        new CommandInvoker().executeCommand(tshirtCommand);
                    } else if (Objects.equals(menu.getClothingOption4(), "rundhalsad")) {
                        Command tshirtCommand = new CommandSewTShirt(tshirt, "rundhalsad");
                        new CommandInvoker().executeCommand(tshirtCommand);
                    } else {
                        Command pantsCommand = new CommandSewTShirt(tshirt, "polo");
                        new CommandInvoker().executeCommand(pantsCommand);
                    }
                    if (Objects.equals(menu.getClothingOption5(), "kortärmad")) {
                        Command tshirtCommand = new CommandCutTShirt(tshirt, "kortärmad");
                        new CommandInvoker().executeCommand(tshirtCommand);
                    } else if (Objects.equals(menu.getClothingOption5(), "långärmad")) {
                        Command tshirtCommand = new CommandCutTShirt(tshirt, "långärmad");
                        new CommandInvoker().executeCommand(tshirtCommand);
                    } else {
                        Command tshirtCommand = new CommandCutTShirt(tshirt, "linne");
                        new CommandInvoker().executeCommand(tshirtCommand);
                    }

                    tshirt.setWorkCompleted(true);
                    orderList.add(tshirt);

        } else {
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
                Command skirtCommand = new CommandSewSkirt(skirt, "låg midja");
                new CommandInvoker().executeCommand(skirtCommand);
            } else if (Objects.equals(menu.getClothingOption4(), "standard midja")) {
                Command skirtCommand = new CommandSewSkirt(skirt, "standard midja");
                new CommandInvoker().executeCommand(skirtCommand);
            } else {
                Command skirtCommand = new CommandSewSkirt(skirt, "hög midja");
                new CommandInvoker().executeCommand(skirtCommand);
            }
            if (Objects.equals(menu.getClothingOption5(), "rak")) {
                Command skirtCommand = new CommandCutSkirt(skirt, "rak");
                new CommandInvoker().executeCommand(skirtCommand);
            } else if (Objects.equals(menu.getClothingOption5(), "a-linje")) {
                Command skirtCommand = new CommandCutSkirt(skirt, "a-linje");
                new CommandInvoker().executeCommand(skirtCommand);
            } else {
                Command skirtCommand = new CommandCutSkirt(skirt, "volang");
                new CommandInvoker().executeCommand(skirtCommand);
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
