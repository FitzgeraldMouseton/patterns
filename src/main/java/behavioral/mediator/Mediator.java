package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Медиатор - это, как следует из названия, некоторый промежуточный объект, применяемый для уменьшения связанности
 * объектов. В данном примере мы используем медиатор для того, чтобы решать, нужно ли включать свет в данной локации.
 * В отличие от варианта из пакета command, мы передаем в конструктор команды объект медиатора, а не объект Light,
 * добиваясь таким образом большей независимости объектов.
 * В этом классе можно аггрегировать различные методы, которые будут вызываться различными классами комманд.
 * Для полноты картины можно еще добавить инвоукера Switch. Паттерны Command и Mediator очень хорошо дополняют друг друга
 */

public class Mediator {

    private final List<Light> lights = new ArrayList<>();

    public void registerLight(Light light) {
        lights.add(light);
    }

    public void turnOnAllLights() {
        lights.stream().filter(light -> !light.isOn()).forEach(Light::toggle);
    }

    public void turnOffAllLights() {
        lights.stream().filter(Light::isOn).forEach(Light::toggle);
    }
}
