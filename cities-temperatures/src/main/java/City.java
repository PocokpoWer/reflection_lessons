import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@EqualsAndHashCode
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
