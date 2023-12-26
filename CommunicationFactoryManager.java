public class CommunicationFactoryManager {
    private static CommunicationFactoryManager instance;

    public static CommunicationFactoryManager getInstance() {
        if (instance == null) 
            instance = new CommunicationFactoryManager();
        return instance;
    }

    public CommunicationFactory getFactory(String customerType) {
        switch (customerType) {
            case "Regular":
                return new RegularCustomer();
            case "Mountain":
                return new MountainCustomer();
            case "Delinquent":
                return new DelinquentCustomer();
            default:
                throw new IllegalArgumentException("Invalid customer type: " + customerType);
        }
    }
}