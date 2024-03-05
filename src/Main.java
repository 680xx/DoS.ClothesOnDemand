public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.customerMeny();

        OrderController orderController = new OrderController();
        orderController.builderPattern(menu);

        Receipt receipt = new Receipt();
        receipt.printReceipt();

    }
}