package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class PersonClient {

    public List<Person> getPersonList() {
        List<Person> personList = new ArrayList<>();
        Person personFromDB = new PersonDB("1234", "Fitz", "Mouse");
        personList.add(personFromDB);

        //Не будет работать
        PersonLdap personFromLdap = new PersonLdap(34, "Square", "Entrepreneur");
        personList.add(new PersonAdapterLdap(personFromLdap));

        return personList;
    }
}
