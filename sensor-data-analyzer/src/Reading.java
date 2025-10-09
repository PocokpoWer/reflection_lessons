import com.fasterxml.jackson.annotation.JsonProperty;

public record Reading(
        @JsonProperty("value") double value,
        @JsonProperty("timestamp") MyDateTime timestamp
) {
}
