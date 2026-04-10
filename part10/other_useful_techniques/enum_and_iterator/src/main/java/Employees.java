import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Employees {
    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
                .forEach(person -> employees.add(person));

        /* Alternative way of achieving the same
        Iterator<Person> iterator = peopleToAdd.iterator();
        iterator.forEachRemaining(person -> employees.add(person)); */
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) iterator.remove();
        }
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        List<Person> suitableEmployees = employees.stream()
                .filter(person -> person.getEducation() == education)
                .collect(Collectors.toList());

        Iterator<Person> iterator = suitableEmployees.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}