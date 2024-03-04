import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = CustomerController.getCustomerList();

        Menu menu = new Menu();

        menu.customerMeny();



     }
}