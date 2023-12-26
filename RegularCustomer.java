public class RegularCustomer implements CommunicationFactory {
    @Override
    public Email createEmail() {
        return new Email("Regular Customer Email");
    }

    @Override
    public Brochure createBrochure() {
        return new Brochure("Regular Customer Brochure");
    }
}