public class DelinquentCustomer implements CommunicationFactory {
    @Override
    public Email createEmail() {
        return new Email("Delinquent Customer Email");
    }

    @Override
    public Brochure createBrochure() {
        return new Brochure("Delinquent Customer Brochure");
    }
}