import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CityAnalyzerTest {
    @Test
    void getHighestTemperature() {
        List<City> list = List.of(
                City.builder().name("Buda").temperature(12).build(),
                City.builder().name("Pest").temperature(30).build(),
                City.builder().name("Gyál").temperature(23).build(),
                City.builder().name("Csepel").temperature(10).build());
        CityAnalyzer cityAnalyzer = new CityAnalyzer();
        City expected = new City("Pest", 30);
        assertEquals(expected, cityAnalyzer.getHighestTemperature(list));
    }

    @Test
    void getLowestTemperature() {
        List<City> list = List.of(
                City.builder().name("Buda").temperature(12).build(),
                City.builder().name("Pest").temperature(30).build(),
                City.builder().name("Gyál").temperature(23).build(),
                City.builder().name("Csepel").temperature(10).build());
        CityAnalyzer cityAnalyzer = new CityAnalyzer();
        City expected = new City("Csepel", 10);
        assertEquals(expected, cityAnalyzer.getLowestTemperature(list));
    }

    @Test
    void calcAverageTemperature() {
        List<City> list = List.of(
                City.builder().name("Buda").temperature(12).build(),
                City.builder().name("Pest").temperature(30).build(),
                City.builder().name("Gyál").temperature(23).build(),
                City.builder().name("Csepel").temperature(10).build());
        CityAnalyzer cityAnalyzer = new CityAnalyzer();
        double expected = 18.75;
        assertEquals(expected, cityAnalyzer.calcAverageTemperature(list));
    }

    @Test
    void getCityClosestToAverage() {
        List<City> list = List.of(
                City.builder().name("Buda").temperature(12).build(),
                City.builder().name("Pest").temperature(30).build(),
                City.builder().name("Gyál").temperature(23).build(),
                City.builder().name("Csepel").temperature(10).build());
        CityAnalyzer cityAnalyzer = new CityAnalyzer();
        City expected = new City("Gyál", 23);
        assertEquals(expected, cityAnalyzer.getCityClosestToAverage(list));
    }
}