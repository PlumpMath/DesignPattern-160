package Factory.StaticFactory;

/**
 * Created by dell on 2016/4/27.
 */
public class Client {
    public static void main(String[] args) {
        A a = Factory.createA();
        B b = Factory.createB();
    }
}
