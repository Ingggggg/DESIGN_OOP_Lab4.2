import java.util.Scanner;

public class CustomerApplication {
    private CommunicationFactoryManager factoryManager;

    public CustomerApplication() {
        this.factoryManager = CommunicationFactoryManager.getInstance();
    }

    public String generateMailAndBrochure(String customerType) {
        CommunicationFactory factory = factoryManager.getFactory(customerType);
        Email email = factory.createEmail();
        Brochure brochure = factory.createBrochure();

        return email.getEmail() + "\n" + brochure.getBrochure();
    }

    public static String getCustomerTypeFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = in.nextInt();
        in.close();

        switch (type) {
            case 1:
                return "Regular";
            case 2:
                return "Mountain";
            case 3:
                return "Delinquent";
            default:
                throw new IllegalArgumentException("Invalid customer type: " + type);
        }
    }

    public static void main(String[] args) {
        String customerType = getCustomerTypeFromUser();
        CustomerApplication app = new CustomerApplication();
        System.out.println(app.generateMailAndBrochure(customerType));
    }
}