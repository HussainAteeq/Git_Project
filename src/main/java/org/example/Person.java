package org.example;

public class Person {
    int age;
    String name;

    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    String getName()
    {
        return name;
    }

    int getAge()
    {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
