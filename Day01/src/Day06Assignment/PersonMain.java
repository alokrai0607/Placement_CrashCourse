package Day06Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
}

public class PersonMain {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alok", 30));
        people.add(new Person("Anil", 25));
        people.add(new Person("Sandip", 35));

        // Sorting by age using natural ordering (Comparable)
        System.out.println("Sorted by age:");
        Collections.sort(people);
        printList(people);

        // Sorting by name using Comparator
        System.out.println("\nSorted by name:");
        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
        Collections.sort(people, nameComparator);
        printList(people);
    }

    private static void printList(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
