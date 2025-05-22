public class Person {
    String name;
    int age;
    Gender gender;

    public Person() {
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + ". I am " + age + ". I am a " + Gender.MAN);
    }

    public void printGoal() {
        System.out.println("My goal is to be happy in the future.");
    }
}
