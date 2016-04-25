package Command;

/**
 * Created by dell on 2016/4/24.
 */
public class CommandOn implements  Command {
    private final TV tv;

    public  CommandOn(TV tv){
        this.tv = tv;
    }


    @Override
    public void excute() {
        this.tv.turnOn();
    }
}
