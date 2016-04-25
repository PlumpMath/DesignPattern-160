package Command;

/**
 * Created by dell on 2016/4/24.
 */
public class CommandOff implements  Command {
    private TV tv;
    public CommandOff(TV tv){
        this.tv = tv;
    }
    @Override
    public void excute() {
        this.tv.turnOff();
    }
}
