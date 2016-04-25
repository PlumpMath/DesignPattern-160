package adapter.extend;

/**
 * Created by dell on 2016/4/23.
 * 通过继承原有类获得source的方法
 * 这样实现ITargetable的类都具有source的方法
 */
public class Test {
    public static void main(String[] args) {
        ITargetable targetable = new Adapter();
        targetable.printA();
        targetable.printB();
    }
}
