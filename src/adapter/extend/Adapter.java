package adapter.extend;

/**
 * Created by dell on 2016/4/23.
 * 这个是继承方式的适配器
 */
public class Adapter extends Source implements ITargetable{
    @Override
    public void printB() {
        System.out.println("this is extend Adapter B");
    }
}
