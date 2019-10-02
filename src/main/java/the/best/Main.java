package the.best;

public class Main {
    public static void main(String[] args) {
        Observer schoolPublication = new ObserverImpl();

        schoolPublication.subscribe(TypePeriodicalPublication.NEWSPAPER,
                new SubscriberImpl("Kolia"));

        schoolPublication.subscribe(TypePeriodicalPublication.NEWSPAPER,
                new SubscriberImpl("Nastia"));

        schoolPublication.subscribe(TypePeriodicalPublication.NEWSPAPER,
                new SubscriberImpl("Dima"));

        schoolPublication.subscribe(TypePeriodicalPublication.MAGAZINE,
                new SubscriberImpl("Tolia"));

        schoolPublication.subscribe(TypePeriodicalPublication.MAGAZINE,
                new SubscriberImpl("Vania"));

        schoolPublication.notify(TypePeriodicalPublication.NEWSPAPER, "Kyiv Times");
        schoolPublication.notify(TypePeriodicalPublication.MAGAZINE, "People");
    }

}
