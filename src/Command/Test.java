package Command;

/**
 * Created by dell on 2016/4/24.
 */
public class Test {
    public static void main(String[] args) {
        TV tv = new TV();
        Command  commandOn = new CommandOn(tv);
        Command  commandOff = new CommandOff(tv);
        Command  commandChange = new CommandChange(tv,2);
        Control control = new Control(commandOn,commandOff,commandChange);
        control.turnOn();
        control.changeChannel();
        control.turnOff();
    }
}
