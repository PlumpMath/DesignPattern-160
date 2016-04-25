package Command;

/**
 * Created by dell on 2016/4/24.
 */
public class CommandChange implements  Command {
    private TV tv;
    private int channel;
    public CommandChange(TV tv,int channel){
        this.tv = tv;
        this.channel = channel;
    }
    @Override
    public void excute() {
        this.tv.ChangeChannel(channel);
    }
}
