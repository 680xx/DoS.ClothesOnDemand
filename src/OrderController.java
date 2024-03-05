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
