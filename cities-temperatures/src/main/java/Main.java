import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CsvParser csvParser = new CsvParser();
        CityAnalyzer cityAnalyzer = new CityAnalyzer();

        List<City> cities = csvParser.read("src/main/java/temperatures.csv");
        cities.stream().forEach(System.out::print);

        System.out.println();
        System.out.println("Calculated results: ");
        System.out.println("City with the highest temperature: " + cityAnalyzer.getHighestTemperature(cities));
        System.out.println("City with the lowest temperature: " + cityAnalyzer.getLowestTemperature(cities));
        System.out.printf("Average temperature: %.1f Celsius\n", cityAnalyzer.calcAverageTemperature(cities));
        System.out.println();
        System.out.println("City closest to the average temperature: " + cityAnalyzer.getCityClosestToAverage(cities));
    }
}
