package com.diosoft.training;

public class Main {

    public static void main(String[] args) {
        PersonImpl person1 = new PersonImpl("Lola", null, 21, JobTitle.DEV);
        ((PersonImpl)person1).setAge(12);
        PersonImpl person2 = new PersonImpl("Lola2", null, 21, JobTitle.QA);

        doEquals(person1, person2);
    }

    private static void doEquals(Person person1, Person person2) {
        System.out.println("is equals " + person1.equals(person2));
        System.out.println(person1);
        System.out.println(person2);
    }
}
