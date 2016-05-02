package Factory.abstractFactory;

/**
 * Created by dell on 2016/4/27.
 */
public class AFactory implements Provider {
    @Override
    public Product create() {
        return new A();
    }
}
