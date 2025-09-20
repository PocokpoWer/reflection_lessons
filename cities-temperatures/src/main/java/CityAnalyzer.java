import java.util.List;

public class CityAnalyzer {
    public City getHighestTemperature(List<City> input) {
        City result = input.get(0);
        for (City city : input) {
            if (city.getTemperature() > result.getTemperature()) {
                result = city;
            }
        }
        return result;
    }

    public City getLowestTemperature(List<City> input) {
        City result = input.get(0);
        for (City city : input) {
            if (city.getTemperature() < result.getTemperature()) {
                result = city;
            }
        }
        return result;
    }

    public double calcAverageTemperature(List<City> input) {
        double sum = 0.0;
        for (City city : input) {
            sum += city.getTemperature();
        }
        return sum / input.size();
    }

    public City getCityClosestToAverage(List<City> input) {
        City result = input.get(0);
        double avg = calcAverageTemperature(input);
        double different = Math.abs(input.get(0).getTemperature() - avg);
        for (City city : input) {
            double temporaryDifferent = Math.abs(city.getTemperature() - avg);
            if (temporaryDifferent < different) {
                different = temporaryDifferent;
                result = city;
            }
        }
        return result;
    }
}
