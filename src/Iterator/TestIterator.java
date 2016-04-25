package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dell on 2016/4/22.
 */
public class TestIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        Iterator it =list.iterator();
        while(it.hasNext()){
            it.remove();
        }
    }


}
