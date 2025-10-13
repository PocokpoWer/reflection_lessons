import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public MyDateTime(int year, int month, int day, int hour, int minute) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return String.format("%s %s.%s. %s:%s", year, month, day, hour, minute);
    }

}
