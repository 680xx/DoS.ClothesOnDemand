import BusinessObjects.*;

import java.util.ArrayList;
import java.util.Objects;

public class OrderController {

    public OrderController () {
    }

    private static ArrayList<Object> orderList = new ArrayList<>();
    public void builderPattern(Menu menu) {

        if (Objects.equals(menu.getClothing(), "byxa")) {
            PantsBuilder builder = new PantsBuilder();
            Pants pants = builder
                    .setMaterial(menu.getClothingOption1())
                    .setSize(menu.getClothingOption2())
                    .setColor(menu.getClothingOption3())
                    .build();

                    pants.setId(orderList.size()+1);
                    pants.setName(menu.getClothingOption3() + " " + menu.getClothing());
                    pants.setPrice(menu.getClothingPrice());

                    orderList.add(pants);


        } else if (Objects.equals(menu.getClothing(), "tröja")) {
            TShirtBuilder builder = new TShirtBuilder();
            TShirt tshirt = builder
                    .setMaterial(menu.getClothingOption1())
                    .setSize(menu.getClothingOption2())
                    .setColor(menu.getClothingOption3())
                    .build();

                    tshirt.setId(orderList.size()+1);
                    tshirt.setName(menu.getClothingOption3() + " " + menu.getClothing());
                    tshirt.setPrice(menu.getClothingPrice());

                    orderList.add(tshirt);

        } else {
            SkirtBuilder builder = new SkirtBuilder();
            Skirt skirt = builder
                    .setMaterial(menu.getClothingOption1())
                    .setSize(menu.getClothingOption2())
                    .setColor(menu.getClothingOption3())
                    .build();

            skirt.setId(orderList.size()+1);
            skirt.setName(menu.getClothingOption3() + " " + menu.getClothing());
            skirt.setPrice(menu.getClothingPrice());

            orderList.add(skirt);
        }
    }

    public void commandPattern() {

    }

    public static ArrayList getOrderList() {
        return orderList;
    }

}
