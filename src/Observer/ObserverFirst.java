package Observer;

/**
 * Created by lichq on 2016/4/25.
 */
public class ObserverFirst  implements  Observer{
    @Override
    public void update() {
        System.out.println("fisrt Observer working");
    }
}
