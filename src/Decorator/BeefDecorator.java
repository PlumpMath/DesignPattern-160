package Decorator;

/**
 * Created by dell on 2016/4/26.
 */
public class BeefDecorator extends  NoodleDecorator {
    public BeefDecorator (Noodle noodle){
       super(noodle);
    }
    @Override
    public void cook() {
        noodle.cook();
        System.out.println("with Beef");
    }
}
