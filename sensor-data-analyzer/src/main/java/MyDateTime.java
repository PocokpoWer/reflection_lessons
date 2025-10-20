import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
@JsonPropertyOrder({"Year", "Month", "Day", "Hour", "Minute"})
public class MyDateTime {

    @JsonProperty("Year")
    private int year;
    @JsonProperty("Month")
    private int month;
    @JsonProperty("Day")
    private int day;
    @JsonProperty("Hour")
    private int hour;
    @JsonProperty("Minute")
    private int minute;

    @Override
    public String toString() {
        return String.format("%s %s.%s. %s:%s", year, month, day, hour, minute);
    }

}
