package behavioral.command;

/**
 * Паттерн command создает некоторую команду не в виде метода, а в виде объекта, в котором реализован нужный метод. Таким образом можно
 * передавать этот объект (команду) в качестве аргумента метода. В этом паттерне участвуют несколько объектов
 * 1) Receiver (Light в данном примере) - объект, метод которого будет вызван в конечном итоге
 * 2) Invoker (Switch) - объект, содержащий реализацию метода, который получает команду в качестве аргумента, и вызывающий соответствующий
 * этой команде метод ресивера
 * 3) Command (interface) - общий интерфейс для различных комманд, которые могут быть переданы инвоукеру, содержащий общий для этих команд метод
 * 4) Concrete commands (OnCommand, ToggleCommand, etc) - конкретные команды, имплементирующие метод интерфейса Command (execute в данном примере)
 * таким образом, чтобы в этом методе вызывался нужный метод ресивера.
 */
public class CommandDemo {

    public static void main(String[] args) {

        //Receiver
        Light light = new Light();
        //Invoker
        Switch lightswitch = new Switch();

        Command toggleCommand = new ToggleCommand(light);
        lightswitch.storeAndExecute(toggleCommand);
        lightswitch.storeAndExecute(toggleCommand);
    }
}
