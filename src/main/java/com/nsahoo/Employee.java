package com.nsahoo;

/**
 * Created by Nibedita on 2/27/2017.
 */
public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name, int age, String city) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    private  int age;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override public String toString()
    {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", city='").append(city).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
