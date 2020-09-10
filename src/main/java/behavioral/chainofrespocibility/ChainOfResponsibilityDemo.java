package behavioral.chainofrespocibility;

import behavioral.chainofrespocibility.handlers.CEO;
import behavioral.chainofrespocibility.handlers.Director;
import behavioral.chainofrespocibility.handlers.VP;
import behavioral.chainofrespocibility.util.Request;
import behavioral.chainofrespocibility.util.RequestType;

/**
 * Здесь имеются очередные "Рога и копыта", где среди прочего есть директор, VP и CEO. Фирма получает какие-то запросы (счета)
 * на различные суммы денег. Некоторые директор обрабатыавет сам, другие переправляет VP'у, а тот в свою очередь некоторые переправляет CEO.
 * Все они отнаследованы от абтрактного класса AbstractHandler и должны реализовать метод handleRequest(). В этом методе прописывается
 * логика обработки запроса текущим хэндлером. Если он не может обработать запрос, то он вызывает этот метод у своего саксессора.
 */

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {

        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request = new Request(RequestType.CONFERENCE, 500);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 30);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        director.handleRequest(request);
    }
}
