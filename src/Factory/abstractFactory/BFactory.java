package Factory.abstractFactory;

/**
 * Created by dell on 2016/4/27.
 */
public class BFactory implements  Provider {
    @Override
    public Product create() {
        return new B();
    }
}
