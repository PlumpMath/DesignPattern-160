package Observer;

/**
 * Created by lichq on 2016/4/25.
 */
public interface Subject {
    public void add(Observer observer);
    public void delete(Observer observer);
    public void notifyall();
    public void selfOperator();
}
