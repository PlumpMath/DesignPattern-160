package Command;

/**
 * Created by dell on 2016/4/24.
 */
public class Control {
    private  Command commandOn;
    private  Command commandOff;
    private  Command commandChange;
    public Control(Command on,Command off ,Command change){
        this.commandOn = on;
        this.commandOff = off;
        this.commandChange = change;
    }

    public void turnOn(){
        commandOn.excute();
    }

    public void turnOff(){
        commandOff.excute();
    }

    public void changeChannel(){
        commandChange.excute();
    }
}
