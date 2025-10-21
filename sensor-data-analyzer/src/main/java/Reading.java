import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"Timestamp", "Value"})
public record Reading(
        @JsonProperty("Value") double value,
        @JsonProperty("Timestamp") MyDateTime timestamp
) {
}
