package task3;

public class Person {
    private final String name;
    private final int age;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        Person person = (Person) obj;
        if (age != person.getAge()) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = result + age;
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", name, age);
    }
}
