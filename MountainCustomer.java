public class MountainCustomer implements CommunicationFactory {
    @Override
    public Email createEmail() {
        return new Email("Mountain Customer Email");
    }

    @Override
    public Brochure createBrochure() {
        return new Brochure("Mountain Customer Brochure");
    }
}