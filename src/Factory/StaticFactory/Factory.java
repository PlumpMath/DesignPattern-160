package Factory.StaticFactory;

/**
 * Created by dell on 2016/4/27.
 */
public class Factory {
    public static A createA(){
        return new A();
    }

    public static B createB(){
        return new B();
    }
}
