package Observer;

/**
 * Created by lichq on 2016/4/25.
 */
public class Test {
    public static void main(String[] args) {
        Subject mysubject = new MySubject();
        Observer observerFirst = new ObserverFirst();
        Observer observerSecond = new ObserverSecond();
        mysubject.add(observerFirst);
        mysubject.add(observerSecond);
        mysubject.selfOperator();
    }
}
