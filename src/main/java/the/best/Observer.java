package the.best;

public interface Observer {
    void subscribe(TypePeriodicalPublication typePeriodicalPublication,
                   Subscriber subscriber);
    void unsubscribe(TypePeriodicalPublication typePeriodicalPublication,
                   Subscriber subscriber);
    void notify(TypePeriodicalPublication typePeriodicalPublication,
                   String data);
}
