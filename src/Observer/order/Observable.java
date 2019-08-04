package Observer.order;

import Observer.notification.Observer;

public interface Observable {

 void registerObserver(Observer observer);
 void  unregisterObserver();
 void notifyObservers();
}
