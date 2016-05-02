package Decorator;

/**
 * Created by dell on 2016/4/26.
 */
public class RiceNoodle implements Noodle {
    private int weight;
    @Override
    public void cook() {
        System.out.println("RICEnoodle");
    }
}
