package the.best;

public class SubscriberImpl implements Subscriber {

    private String name;

    public SubscriberImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(String data) {
        System.out.println(name + " receive new " + data);
    }
}
