package creational;

import creational.singleton.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        final Class<Singleton> singletonClass = Singleton.class;
        final Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
//        final Singleton singleton = constructor.newInstance();
//        System.out.println(singleton.getString());

        final Singleton instance = Singleton.getInstance();
    }
}
