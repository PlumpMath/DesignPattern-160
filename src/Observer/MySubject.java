package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichq on 2016/4/25.
 */
public class MySubject extends AbstractSubject {

    @Override
    public void selfOperator() {
        System.out.println("do something for yourself!");
        notifyall();
    }
}
