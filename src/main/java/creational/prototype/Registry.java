package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry(){
        loadItems();
    }

    public Item createItem(String type){

        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    // Метод добавляет базовые экземпляры объектов в регистр, от которых можно получать клонов и устанавливать этим клонам нужные значения
    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRunTime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(355);
        book.setTitle("Basic Book");
        book.setPrice(19.99);
        items.put("Book", book);
    }
}
