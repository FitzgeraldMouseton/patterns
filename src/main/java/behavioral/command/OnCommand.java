package behavioral.command;

//Concrete command (deprecated)
public class OnCommand implements Command {

    private Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    @Deprecated
    public void execute() {
        light.on();
    }
}
