package behavioral.state;

/**
 * Паттер State довольно простой. У нас тут пример с вентилятором, который может быть в трех разных состояниях -
 * OFF, LOW и MEDIUM (high нет, т.к. может продуть). Для каждого из состояний создается отдельный класс,
 * отнаследованный от общего абстрактного класса. Эти состояния передаются в виде полей в класс вентилятора.
 * Этот паттер позволяет избежать множества if/else блоков
 */

public class StateDemo {
    public static void main(String[] args) {

        Fan fan = new Fan();

        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);
    }
}
