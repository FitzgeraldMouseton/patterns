package structural.adapter;

import java.util.List;

/** Адаптер, как правило, применяется для того, чтобы наладить работу с legacy кодом.
 * PersonLdap - класс, доставшийся нам в наследство. Не имплементит Person, по-другому названы поля.
 * Однако изменить его по какой-то причине мы не можем. Таким образом, мы не можем использовать этот класс для работы
 * нашим PersonClient. Для того, чтобы испраить ситуацию создадим класс PersonAdapterLdap.
 */
public class AdapterDemo {
    public static void main(String[] args) {

        PersonClient client = new PersonClient();
        List<Person> people = client.getPersonList();
        System.out.println(people);
    }
}
