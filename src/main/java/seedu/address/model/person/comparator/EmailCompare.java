package seedu.address.model.person.comparator;

import seedu.address.model.person.Person;

/**
 * A class to compare two Person objects based on Email
 */
public class EmailCompare extends PersonCompare {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getEmail().compareTo(p2.getEmail());
    }

}