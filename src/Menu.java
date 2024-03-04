import java.util.Objects;
import java.util.Scanner;

public class Menu {

    private String customerAddress;
    private String customerZip;
    private String choiceMaterial;
    private String choiceSize;
    private String choiceColor;
    private int

    private boolean orderMenuActive = true;

    // Constructors
    public Menu() {
    }

    private Customer customer = new Customer();

    private void lineBreak() {
        System.out.println("--------------------------------------------");
    }

    public void customerMeny() {

        boolean correctCustomerInfo = false;

        while(!correctCustomerInfo) {

            boolean repeatQuestion = true;
            Scanner scanner = new Scanner(System.in);
            lineBreak();
            System.out.print("Ange ditt namn: ");
            customer.setName(scanner.nextLine());
            System.out.print("Ange din e-mail: ");
            customer.setEmail(scanner.nextLine());
            System.out.print("Ange din adress: ");
            customerAddress = scanner.nextLine();
            System.out.print("Ange ditt postnummer och ort: ");
            customerZip = scanner.nextLine();
            customer.setAddress(customerAddress + "," + customerZip);
            customer.setId(CustomerController.getCustomerList().size()+1);
            lineBreak();

            while (repeatQuestion) {
                System.out.print("Stämmer all information (j/n): ");
                String infoAnswer = scanner.nextLine();
                if (Objects.equals(infoAnswer, "j") || Objects.equals(infoAnswer, "J")) {
                    CustomerController.addCustomer(customer);                                                   // Add customer to customerList
                    repeatQuestion = false;
                    correctCustomerInfo = true;
                } else if (Objects.equals(infoAnswer, "n") || Objects.equals(infoAnswer, "N")) {
                    repeatQuestion = false;
                } else {
                    System.out.println("Felaktig inmatning.");
                }
            }

        }
        orderMenu();
    }

    private void orderMenu() {

        Scanner scanner = new Scanner(System.in);

        while (orderMenuActive) {

            lineBreak();
            System.out.println("Vilken typ av klädesplagg vill du beställa?\n");
            System.out.println("1. Byxa");
            System.out.println("2. Tröja");
            System.out.println("3. Kjol");
            System.out.println("\nAnge alternativ: ");
            int clothesOption = scanner.nextInt();

            switch (clothesOption) {
                case 1: // Pants
                    lineBreak();
                    System.out.println("Vilket material vill du ha på din byxa?\n");
                    System.out.println("1. Jeans");
                    System.out.println("2. Tyg");
                    System.out.println("\nAnge alternativ: ");
                    int pantsMaterialChoose = scanner.nextInt();
                    switch (pantsMaterialChoose) {
                        case 1: // Jeans
                            pantsMaterial = "Jeans";
                        case 2: // Tyg
                            pantsMaterial = "Tyg";
                        default:
                            System.out.println("Felaktigt alternativ.");
                    }


                case 2: // T-Shirt

                case 3: // Skirt

                default:
                    System.out.println("Felaktigt alternativ.");
            }

        }
    }

}


