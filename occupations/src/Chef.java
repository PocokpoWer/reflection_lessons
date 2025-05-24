public class Chef extends Person {
    public Chef() {
    }

    public Chef(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s. I am %d. I am a %s and a chef ", name, age, gender);
    }

    public String cook(String food) {
        return name + " has cooked some " + food;
    }
}
