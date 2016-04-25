package Decorator;

/**
 * Created by dell on 2016/4/26.
 */
public class Client {
    public static void main(String[] args) {
        Noodle noodle = new RiceNoodle();
        Noodle saltyNoodle = new SaltyDecorator(noodle);
        Noodle saltyAndBeefNoodle = new BeefDecorator(saltyNoodle);
        //做一份米线
        noodle.cook();
        //做一份咸米线
        saltyNoodle.cook();
        //做一份咸味 牛肉米线
        saltyAndBeefNoodle.cook();
    }
}
