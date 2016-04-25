package Decorator;

/**
 * Created by dell on 2016/4/26.
 */
public class SaltyDecorator extends NoodleDecorator {
    public SaltyDecorator(Noodle noodle){
        super(noodle);
    }
    @Override
    public void cook(){
        noodle.cook();
        System.out.println("with salt");
    }
}
