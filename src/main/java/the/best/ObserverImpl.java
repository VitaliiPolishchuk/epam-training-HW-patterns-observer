package the.best;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObserverImpl implements Observer {

    Map<TypePeriodicalPublication, List<Subscriber>> subscribers;

    public ObserverImpl() {
        this.subscribers = new HashMap<>();
    }

    @Override
    public void subscribe(TypePeriodicalPublication typePeriodicalPublication, Subscriber subscriber) {
        if(subscribers.containsKey(typePeriodicalPublication)){
            subscribers.get(typePeriodicalPublication).add(subscriber);
        } else {
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            subscribers.put(typePeriodicalPublication, list);
        }
    }

    @Override
    public void unsubscribe(TypePeriodicalPublication typePeriodicalPublication, Subscriber subscriber) {
        if(subscribers.containsKey(typePeriodicalPublication)){
            subscribers.get(typePeriodicalPublication).remove(subscriber);
        }
    }

    @Override
    public void notify(TypePeriodicalPublication typePeriodicalPublication, String data) {
        if(subscribers.containsKey(typePeriodicalPublication)){
            for(Subscriber subscriber : subscribers.get(typePeriodicalPublication)){
                subscriber.update(data);
            }
        }
    }
}
