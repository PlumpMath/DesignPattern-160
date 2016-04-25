package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichq on 2016/4/25.
 */
public abstract class AbstractSubject implements  Subject {
    List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyall() {
        if(!observers.isEmpty()){
            for(Observer observer : observers){
                observer.update();
            }
        }
    }

    public abstract  void selfOperator() ;
}
