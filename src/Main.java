public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.customerMeny();

        OrderController orderController = new OrderController();
        orderController.builderPattern(menu);

        System.out.println(OrderController.getOrderList().getLast());

    }
}