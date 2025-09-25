import java.util.Comparator;
import java.util.List;

public class CityAnalyzer {
    public City getHighestTemperature(List<City> input) {
        return input.stream().max(Comparator.comparingInt(City::getTemperature)).orElseThrow();
    }

    public City getLowestTemperature(List<City> input) {
        return input.stream().min(Comparator.comparingInt(City::getTemperature)).orElseThrow();
    }

    public double calcAverageTemperature(List<City> input) {
        return input.stream().mapToInt(City::getTemperature).average().orElseThrow();
    }

    public City getCityClosestToAverage(List<City> input) {
        double avgTemp = calcAverageTemperature(input);
        return input.stream().min(Comparator.comparingDouble(city -> Math.abs(city.getTemperature() - avgTemp))).orElseThrow();
    }
}
