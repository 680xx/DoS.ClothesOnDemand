import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = CustomerController.getCustomerList();

        Menu menu = new Menu();
        menu.customerMeny();

        if (Objects.equals(menu.getClothing(), "byxa")) {
            PantsBuilder builder = new PantsBuilder();
            Pants pants = builder
                    .setMaterial(menu.getClothingOption1())
                    .setSize(menu.getClothingOption2())
                    .setColor(menu.getClothingOption3())
                    .build();
            System.out.println(pants);


        } else if (Objects.equals(menu.getClothing(), "tröja")) {

        } else {

        }

    }
}