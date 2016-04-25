package Decorator;

/**
 * Created by dell on 2016/4/26.
 */
public abstract class NoodleDecorator implements Noodle {
    protected Noodle noodle;
    public  NoodleDecorator(Noodle noodle){
        this.noodle = noodle;
    }
    @Override
    public  void cook(){
        this.noodle.cook();
    }
}
