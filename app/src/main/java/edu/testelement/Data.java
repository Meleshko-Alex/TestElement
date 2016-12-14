package edu.testelement;

import java.util.ArrayList;

public class Data {
    private ArrayList<Person> men;
    private ArrayList<Person> women;

    public Data() {
        men = new ArrayList<>();
        men.add(new Person("Ivanov", "student", "Men"));
        men.add(new Person("Petrov", "student", "Men"));
        men.add(new Person("Sidorov", "professor", "Men"));

        women = new ArrayList<>();
        women.add(new Person("Belova", "student", "Women"));
        women.add(new Person("Tolstova", "student", "Women"));
        women.add(new Person("Noskova", "student", "Women"));
        women.add(new Person("Krasnova", "teacher", "Women"));
    }

    public ArrayList<Person> getMen() {
        return men;
    }

    public ArrayList<Person> getWomen() {
        return women;
    }
}
