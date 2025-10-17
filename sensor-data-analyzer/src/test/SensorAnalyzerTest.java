package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SensorAnalyzerTest {
    @Test
    void shouldGetAverageReading() {
        MyDateTime myDateTime = new MyDateTime(2025, 10, 3, 15, 10);
        Sensor sensor = new TemperatureSensor(myDateTime, 1);
        sensor.addReading(20);
        sensor.addReading(21);
        sensor.addReading(23);
        sensor.addReading(24);
        sensor.addReading(24.5);
        double expected = 22.5;
        Assertions.assertEquals(expected, SensorAnalyzer.getAverageReading(sensor));
    }

    @Test
    void shouldGetSensorsAboveThreshold() {
        double threshold = 22.0;
        MyDateTime myDateTime = new MyDateTime(2010, 5, 10, 06, 10);
        TemperatureSensor s1 = new TemperatureSensor(myDateTime, 1);
        s1.addReading(20.0);
        s1.addReading(21.0);
        MyDateTime myDateTime2 = new MyDateTime(2012, 1, 4, 10, 1);
        TemperatureSensor s2 = new TemperatureSensor(myDateTime2, 2);
        s2.addReading(23.0);
        s2.addReading(24.0);
        MyDateTime myDateTime3 = new MyDateTime(2000, 12, 23, 12, 20);
        TemperatureSensor empty = new TemperatureSensor(myDateTime3, 3);

        List<Sensor> testList = List.of(s1, s2, empty);
        List<Sensor> result = SensorAnalyzer.getSensorsAboveThreshold(testList, threshold);
        assertEquals(1, result.size());
        Assertions.assertEquals(2, result.get(0).getId());
    }

    @Test
    void shouldGetSensorWithHighestLatestReading() {
        MyDateTime myDateTime = new MyDateTime(1988, 1, 30, 1, 30);
        var s1 = new TemperatureSensor(myDateTime, 1);
        s1.addReading(21);
        s1.addReading(22);

        MyDateTime myDateTime2 = new MyDateTime(2022, 4, 25, 10, 10);
        var s2 = new TemperatureSensor(myDateTime2, 2);
        s2.addReading(20);
        s2.addReading(24);

        var actual = SensorAnalyzer.getSensorWithHighestLatestReading(List.of(s1, s2));

        assertSame(s2, actual);
        Assertions.assertEquals(24.0, actual.getLatestReading().value(), 1e-9);
    }

    @Test
    void shouldGetLatestReadingsGroupedByType() {
        MyDateTime myDateTime = new MyDateTime(2025, 10, 3, 15, 10);
        Sensor s1 = new TemperatureSensor(myDateTime, 1);
        s1.addReading(20.0);
        MyDateTime myDateTime2 = new MyDateTime(2025, 9, 20, 15, 59);
        Sensor s2 = new TemperatureSensor(myDateTime2, 2);
        s2.addReading(24.0);
        List<Sensor> testList = List.of(s1, s2);
        Map<String, Double> expected = new HashMap<>();
        expected.put("SensorType: Temperature ID: 1", 20.0);
        expected.put("SensorType: Temperature ID: 2", 24.0);
        Assertions.assertEquals(expected, SensorAnalyzer.getLatestReadingsGroupedByType(testList));
    }
}
