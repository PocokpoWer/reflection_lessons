import lombok.AllArgsConstructor;
import lombok.Getter;

@lombok.EqualsAndHashCode(of = {"name", "temperature"})
@Getter
@AllArgsConstructor
public class City {
    private String name;
    private int temperature;

    @Override
    public String toString() {
        return String.format("%s, %d Celsius\n", name, temperature);
    }
}
