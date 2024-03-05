import BusinessObjects.Customer;

import java.util.Objects;
import java.util.Scanner;

public class Menu {

    private String customerAddress;
    private String customerZip;
    private String clothing;
    private String clothingOption1;
    private String clothingOption2;
    private String clothingOption3;
    private String clothingOption4;
    private String clothingOption5;
    private int clothingPrice;

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
            customer.setAddress(customerAddress + ", " + customerZip);
            customer.setId(CustomerController.getCustomerList().size()+1);
            lineBreak();

            while (repeatQuestion) {
                System.out.print("Stämmer all information (j/n): ");
                String infoAnswer = scanner.nextLine();
                if (Objects.equals(infoAnswer, "j") || Objects.equals(infoAnswer, "J")) {
                    customer.setId(CustomerController.getCustomerList().size() + 1);
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
        boolean orderMenuActive = true;

        int orderChoice = 0;

        while (orderMenuActive) {

            boolean repeatQuestion = true;

            while (clothing == null) {

                lineBreak();
                System.out.println("Vilken typ av klädesplagg vill du beställa?\n");
                System.out.println("1. Byxa á 499 kr");
                System.out.println("2. Tröja á 199 kr");
                System.out.println("3. Kjol á 599 kr");
                System.out.print("\nAnge alternativ: ");
                orderChoice = scanner.nextInt();
                switch (orderChoice) {
                    case 1: // Byxa
                        clothing = "byxa";
                        clothingPrice = 499;
                        break;
                    case 2: // Tröja
                        clothing = "tröja";
                        clothingPrice = 199;
                        break;
                    case 3: // Kjol
                        clothing = "kjol";
                        clothingPrice = 599;
                        break;
                    default:
                        System.out.println("Felaktig inmatning.");
                        break;
                }
            }

            while (clothingOption1 == null) {

                lineBreak();
                System.out.println("Vilket material vill du ha på din " + clothing + "?\n");
                if (Objects.equals(clothing, "byxa")) {
                    System.out.println("1. Jeans");
                    System.out.println("2. Tyg (+100 kr)");
                } else if (Objects.equals(clothing, "tröja")) {
                    System.out.println("1. Bomull (+50 kr)");
                    System.out.println("2. Polyester");
                } else {
                    System.out.println("1. Jeans");
                    System.out.println("2. Skinn (+100 kr)");
                }
                System.out.print("\nAnge alternativ: ");
                orderChoice = scanner.nextInt();

                switch (orderChoice) {
                    case 1:
                        if (Objects.equals(clothing, "byxa")) {
                            clothingOption1 = "jeans";
                        } else if (Objects.equals(clothing, "tröja")) {
                            clothingOption1 = "bomull";
                            clothingPrice += 50;
                        } else clothingOption1 = "jeans"; {
                        }
                    break;
                    case 2:
                        if (Objects.equals(clothing, "byxa")) {
                            clothingOption1 = "tyg";
                            clothingPrice += 100;
                        }
                        else if (Objects.equals(clothing, "tröja")) {
                            clothingOption1 = "polyester";
                        }
                        else clothingOption1 = "skinn"; {
                            clothingPrice += 100;
                        }
                        break;
                    default:
                        System.out.println("Felaktig inmatning.");
                        break;
                }
            }

            while (clothingOption2 == null) {

                lineBreak();
                System.out.println("Vilken storlek vill du ha på din " + clothing + "?\n");
                if (Objects.equals(clothing, "byxa")) {
                    System.out.println("1. Medium");
                    System.out.println("2. Large");
                } else if (Objects.equals(clothing, "tröja")) {
                    System.out.println("1. Medium");
                    System.out.println("2. Large");
                } else {
                    System.out.println("1. Small");
                    System.out.println("2. Medium");
                }
                System.out.print("\nAnge alternativ: ");
                orderChoice = scanner.nextInt();

                switch (orderChoice) {
                    case 1:
                        if (Objects.equals(clothing, "byxa")) clothingOption2 = "medium";
                        else if (Objects.equals(clothing, "tröja")) clothingOption2 = "medium";
                        else clothingOption2 = "small";
                        break;
                    case 2:
                        if (Objects.equals(clothing, "byxa")) clothingOption2 = "large";
                        else if (Objects.equals(clothing, "tröja")) clothingOption2 = "large";
                        else clothingOption2 = "medium";
                        break;
                    default:
                        System.out.println("Felaktig inmatning.");
                        break;
                }
            }

            while (clothingOption3 == null) {

                lineBreak();
                System.out.println("Vilken färg vill du ha på din " + clothing + "?\n");
                if (Objects.equals(clothing, "byxa")) {
                    System.out.println("1. Svart");
                    System.out.println("2. Blå");
                } else if (Objects.equals(clothing, "tröja")) {
                    System.out.println("1. Grå");
                    System.out.println("2. Röd");
                } else {
                    System.out.println("1. Svart");
                    System.out.println("2. Vit");
                }
                System.out.print("\nAnge alternativ: ");
                orderChoice = scanner.nextInt();

                switch (orderChoice) {
                    case 1:
                        if (Objects.equals(clothing, "byxa")) clothingOption3 = "svart";
                        else if (Objects.equals(clothing, "tröja")) clothingOption3 = "grå";
                        else clothingOption3 = "svart";
                        break;
                    case 2:
                        if (Objects.equals(clothing, "byxa")) clothingOption3 = "blå";
                        else if (Objects.equals(clothing, "tröja")) clothingOption3 = "röd";
                        else clothingOption3 = "vit";
                        break;
                    default:
                        System.out.println("Felaktig inmatning.");
                        break;
                }
            }

            while (clothingOption4 == null) {

                lineBreak();
                System.out.println("Vilken passform vill du ha på din " + clothing + "?\n");
                if (Objects.equals(clothing, "byxa")) {
                    System.out.println("1. Regular fit");
                    System.out.println("2. Slim fit");
                    System.out.println("3. Relaxed fit");
                } else if (Objects.equals(clothing, "tröja")) {
                    System.out.println("1. V-ringad");
                    System.out.println("2. Rundhalsad");
                    System.out.println("3. Polo");
                } else {
                    System.out.println("1. Låg midja");
                    System.out.println("2. Standard midja");
                    System.out.println("3. Hög midja");
                }
                System.out.print("\nAnge alternativ: ");
                orderChoice = scanner.nextInt();

                switch (orderChoice) {
                    case 1:
                        if (Objects.equals(clothing, "byxa")) clothingOption4 = "regular fit";
                        else if (Objects.equals(clothing, "tröja")) clothingOption4 = "v-ringad";
                        else clothingOption4 = "låg midja";
                        break;
                    case 2:
                        if (Objects.equals(clothing, "byxa")) clothingOption4 = "slim fit";
                        else if (Objects.equals(clothing, "tröja")) clothingOption4 = "rundhalsad";
                        else clothingOption4 = "standard midja";
                        break;
                    case 3:
                        if (Objects.equals(clothing, "byxa")) clothingOption4 = "relaxed fit";
                        else if (Objects.equals(clothing, "tröja")) clothingOption4 = "polo";
                        else clothingOption4 = "hög midja";
                        break;
                    default:
                        System.out.println("Felaktig inmatning.");
                        break;
                }
            }

            while (clothingOption5 == null) {

                lineBreak();
                if (Objects.equals(clothing, "byxa")) {
                    System.out.println("Vilken längd vill du ha på din " + clothing + "?\n");
                    System.out.println("1. Shorts");
                    System.out.println("2. Trekvarts (+50 kr)");
                    System.out.println("3. Standard (+100 kr)");
                } else if (Objects.equals(clothing, "tröja")) {
                    System.out.println("Vilken ärmlängd vill du ha på din " + clothing + "?\n");
                    System.out.println("1. Kortärmad (+50 kr)");
                    System.out.println("2. Långärmad (+100 kr)");
                    System.out.println("3. Linne");
                } else {
                    System.out.println("Vilken modell vill du ha på din " + clothing + "?\n");
                    System.out.println("1. Rak");
                    System.out.println("2. A-linje (+100 kr)");
                    System.out.println("3. Volang (+100 kr)");
                }
                System.out.print("\nAnge alternativ: ");
                orderChoice = scanner.nextInt();

                switch (orderChoice) {
                    case 1:
                        if (Objects.equals(clothing, "byxa")) {
                            clothingOption5 = "shorts";
                        }
                        else if (Objects.equals(clothing, "tröja")) {
                            clothingOption5 = "kortärmad";
                            clothingPrice += 50;
                        }
                        else clothingOption5 = "rak"; {
                        }
                        break;
                    case 2:
                        if (Objects.equals(clothing, "byxa")) {
                            clothingOption5 = "trekvarts";
                            clothingPrice += 50;
                        }
                        else if (Objects.equals(clothing, "tröja")) {
                            clothingOption5 = "långärmad";
                            clothingPrice += 100;
                        }
                        else {
                            clothingOption5 = "a-linje";
                            clothingPrice += 100;
                        }
                        break;
                    case 3:
                        if (Objects.equals(clothing, "byxa")) {
                            clothingOption5 = "standard";
                            clothingPrice += 100;
                        }
                        else if (Objects.equals(clothing, "tröja")) {
                            clothingOption5 = "linne";
                        }
                        else {
                            clothingOption5 = "volang";
                            clothingPrice += 100;
                        }
                        break;
                    default:
                        System.out.println("Felaktig inmatning.");
                        break;
                }
            }

            lineBreak();
            System.out.println("Orderspecifikation:");
            System.out.println("\nKlädesplagg: " + clothing);
            System.out.println("Material: " + clothingOption1);
            System.out.println("Storlek: " + clothingOption2);
            System.out.println("Färg: " + clothingOption3);
            System.out.println("Övriga val: " + clothingOption4 + ", " + clothingOption5);
            System.out.println("Pris: " + clothingPrice + " kr");
            System.out.print("\nStämmer uppgifterna för din beställning (j/n)? ");

            while (repeatQuestion) {
                Scanner scanner1 = new Scanner(System.in);
                String infoAnswer = scanner1.nextLine();

                if (Objects.equals(infoAnswer, "j") || Objects.equals(infoAnswer, "J")) {
                    orderMenuActive = false;
                    break;
                } else if (Objects.equals(infoAnswer, "n") || Objects.equals(infoAnswer, "N")) {
                    clothing = null;
                    clothingOption1 = null;
                    clothingOption2 = null;
                    clothingOption3 = null;
                    clothingOption4 = null;
                    clothingOption5 = null;
                    break;
                } else {
                    System.out.println("Felaktig inmatning.");
                    break;
                }
            }
        }
    }

    // Getters
    public String getClothing() {
        return clothing;
    }

    public String getClothingOption1() {
        return clothingOption1;
    }

    public String getClothingOption2() {
        return clothingOption2;
    }

    public String getClothingOption3() {
        return clothingOption3;
    }

    public String getClothingOption4() {
        return clothingOption4;
    }

    public String getClothingOption5() {
        return clothingOption5;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getClothingPrice() {
        return clothingPrice;
    }
}



