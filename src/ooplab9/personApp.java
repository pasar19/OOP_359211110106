package ooplab9;

import jdk.nashorn.internal.scripts.JO;

public class personApp {

    public static void main(String[] args) {
        Person person = new Person("Pasar Auttmang", 21,
                new Address("2", "Nakhornsithammarat",
                        "80110"),
                new Job("student", 20000));
        System.out.println(person.toString());

        //edit data of object
        person.getJob().setSalary(20000);
        System.out.println(person.getJob().getPosition());
        System.out.println(person.getJob().getSalary());








    }
}