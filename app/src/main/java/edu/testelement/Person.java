package edu.testelement;


public class Person {
    private String name;
    private String status;
    private String sex;

    public Person(String name, String status, String sex) {
        this.name = name;
        this.status = status;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getSex() {
        return sex;
    }
}
