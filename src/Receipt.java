import BusinessObjects.Customer;
import BusinessObjects.Pants;
import BusinessObjects.Skirt;
import BusinessObjects.TShirt;
import java.util.ArrayList;

public class Receipt {

    private ArrayList<Object> orderList = OrderController.getOrderList();
    private ArrayList<Customer> customerList = CustomerController.getCustomerList();

    public void printReceipt() {


        if (orderList.getLast() instanceof Pants pants) {
            System.out.println("\nOrdernr. " + pants.getId() + " # specifikation");
            System.out.println("--------------------------");
            System.out.println("Klädesplagg: " + pants.getName());
            System.out.println("Material: " + pants.getMaterial());
            System.out.println("Storlek: " + pants.getSize());
            System.out.println("Färg: " + pants.getColor());
            System.out.println("Övriga val: " + pants.getFit() + ", " + pants.getLength());
            System.out.println("Pris : " + pants.getPrice() + " kr");
        } else if (orderList.getLast() instanceof TShirt tshirt) {
            System.out.println("\nOrdernr. " + tshirt.getId() + " # specifikation");
            System.out.println("--------------------------");
            System.out.println("Klädesplagg: " + tshirt.getName());
            System.out.println("Material: " + tshirt.getMaterial());
            System.out.println("Storlek: " + tshirt.getSize());
            System.out.println("Färg: " + tshirt.getColor());
            System.out.println("Övriga val: " + tshirt.getNeck() + ", " + tshirt.getSleeves());
            System.out.println("Pris : " + tshirt.getPrice() + " kr");
        } else if (orderList.getLast() instanceof Skirt skirt) {
            System.out.println("\nOrdernr. " + skirt.getId() + " # specifikation");
            System.out.println("--------------------------");
            System.out.println("Klädesplagg: " + skirt.getName());
            System.out.println("Material: " + skirt.getMaterial());
            System.out.println("Storlek: " + skirt.getSize());
            System.out.println("Färg: " + skirt.getColor());
            System.out.println("Övriga val: " + skirt.getWaistline() + ", " + skirt.getPattern());
            System.out.println("Pris : " + skirt.getPrice() + " kr");
        }
        System.out.println("\nKundnummer: " + customerList.getLast().getId());
        System.out.println("Namn: " + customerList.getLast().getName());
        System.out.println("E-post: " + customerList.getLast().getEmail());
        System.out.println("Adress: " + customerList.getLast().getAddress());
    }

}
