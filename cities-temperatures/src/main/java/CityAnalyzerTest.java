import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CityAnalyzerTest {
    @Test
    public void shouldGetHighestTemperature() {
        List<City> list = List.of(
                new City("Buda", 12),
                new City("Pest", 30),
                new City("Gyál", 23),
                new City("Csepel", 10));
        CityAnalyzer cityAnalyzer = new CityAnalyzer();
        City expected = new City("Pest", 30);
        assertEquals(expected, cityAnalyzer.getHighestTemperature(list));
    }

    @Test
    public void shouldGetLowestTemperature() {
        List<City> list = List.of(
                new City("Buda", 12),
                new City("Pest", 30),
                new City("Gyál", 23),
                new City("Csepel", 10));
        CityAnalyzer cityAnalyzer = new CityAnalyzer();
        City expected = new City("Csepel", 10);
        assertEquals(expected, cityAnalyzer.getLowestTemperature(list));
    }

    @Test
    public void shouldCalcAverageTemperature() {
        List<City> list = List.of(
                new City("Buda", 12),
                new City("Pest", 30),
                new City("Gyál", 23),
                new City("Csepel", 10));
        CityAnalyzer cityAnalyzer = new CityAnalyzer();
        double expected = 18.75;
        assertEquals(expected, cityAnalyzer.calcAverageTemperature(list));
    }

    @Test
    public void shouldGetCityClosestToAverage() {
        List<City> list = List.of(
                new City("Buda", 12),
                new City("Pest", 30),
                new City("Gyál", 23),
                new City("Csepel", 10));
        CityAnalyzer cityAnalyzer = new CityAnalyzer();
        City expected = new City("Gyál", 23);
        assertEquals(expected, cityAnalyzer.getCityClosestToAverage(list));
    }
}
