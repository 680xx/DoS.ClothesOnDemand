import BusinessObjects.Customer;

import java.util.ArrayList;

public class CustomerController {

    private static ArrayList<Customer> customerList = new ArrayList<>();

    public static void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public static ArrayList getCustomerList() {
        return customerList;
    }



}
