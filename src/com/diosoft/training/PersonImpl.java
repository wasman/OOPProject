package com.diosoft.training;

public class PersonImpl implements Person {

    private String firstName;
    private String secoundName;
    private int age;
    private JobTitle title;

    public PersonImpl(String firstName, String secoundName, int age, JobTitle title) {
        this.firstName = firstName;
        this.secoundName = secoundName;
        this.age = age;
        this.title = title;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getSecoundName() {
        return secoundName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public JobTitle getTitle() {
        return title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecoundName(String secoundName) {
        this.secoundName = secoundName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTitle(JobTitle title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }

        PersonImpl personImpl = (PersonImpl) o;

        if (age != personImpl.age) {
            return false;
        }
        if (firstName != null ? !firstName.equals(personImpl.firstName) : personImpl.firstName != null) {
            return false;
        }
        if (secoundName != null ? !secoundName.equals(personImpl.secoundName) : personImpl.secoundName != null) {
            return false;
        }
        if (title != personImpl.title) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secoundName != null ? secoundName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", secoundName='").append(secoundName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", title=").append(title);
        sb.append('}');
        return sb.toString();
    }
}
