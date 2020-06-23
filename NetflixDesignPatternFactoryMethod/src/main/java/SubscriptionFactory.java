public class SubscriptionFactory {

    public Subscription getSubscription(String subscriptionName) {
        if (subscriptionName.equals("Standard")) {
            return new Standard();
        } if (subscriptionName.equals("Business")) {
            return new Business();
        } if (subscriptionName.equals("Premium")) {
            return new Premium();
        } else {
            return null;
        }
    }

}
