package Factory.abstractFactory;

/**
 * Created by dell on 2016/4/27.
 */
public class Client {
    public static void main(String[] args) {
        Provider providerB = new BFactory();
        providerB.create();
        Provider providerA = new AFactory();
        providerA.create();
    }
}
