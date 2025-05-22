public class Chef extends Person {
    public Chef() {
    }

    public Chef(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public void introduce() {
    }

    public String cook(String food) {
        return name + " has cooked some " + food;
    }
}
