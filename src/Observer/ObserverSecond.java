package Observer;

/**
 * Created by lichq on 2016/4/25.
 */
public class ObserverSecond implements Observer {
    @Override
    public void update() {
        System.out.println("second Observer work");
    }
}
