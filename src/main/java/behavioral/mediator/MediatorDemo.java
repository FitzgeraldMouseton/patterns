package behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        Light kitchenLight = new Light("Kitchen");
        Light bedroomLight = new Light("Bedroom");

        mediator.registerLight(kitchenLight);
        mediator.registerLight(bedroomLight);

        Command turnOnAll = new TurnOnAllLightsCommand(mediator);
        Command turnOffAll = new TurnOffAllLightsCommand(mediator);
        turnOnAll.execute();
        turnOffAll.execute();

    }
}
