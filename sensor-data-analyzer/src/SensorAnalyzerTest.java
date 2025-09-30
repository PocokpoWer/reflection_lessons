import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SensorAnalyzerTest {
    @Test
    void shouldGetAverageReading() {
        Sensor sensor = new TemperatureSensor(1);
        sensor.addReading(20);
        sensor.addReading(21);
        sensor.addReading(23);
        sensor.addReading(24);
        sensor.addReading(24.5);
        double expected = 22.5;
        assertEquals(expected, SensorAnalyzer.getAverageReading(sensor));
    }

    @Test
    void shouldGetSensorsAboveThreshold() {
        double threshold = 22.0;
        TemperatureSensor s1 = new TemperatureSensor(1);
        s1.addReading(20.0);
        s1.addReading(21.0);
        TemperatureSensor s2 = new TemperatureSensor(2);
        s2.addReading(23.0);
        s2.addReading(24.0);
        TemperatureSensor empty = new TemperatureSensor(3);

        List<Sensor> testList = List.of(s1, s2, empty);
        List<Sensor> result = SensorAnalyzer.getSensorsAboveThreshold(testList, threshold);
        assertEquals(1, result.size());
        assertEquals(2, result.get(0).getId());
    }

    @Test
    void shouldGetSensorWithHighestLatestReading() {
        var s1 = new TemperatureSensor(1);
        s1.addReading(21);
        s1.addReading(22);

        var s2 = new TemperatureSensor(2);
        s2.addReading(20);
        s2.addReading(24);

        var actual = SensorAnalyzer.getSensorWithHighestLatestReading(List.of(s1, s2));

        assertSame(s2, actual);
        assertEquals(24.0, actual.getLatestReading(), 1e-9);
    }

    @Test
    void shouldGetLatestReadingsGroupedByType89() {
        Sensor s1 = new TemperatureSensor(1);
        s1.addReading(20.0);
        Sensor s2 = new TemperatureSensor(2);
        s2.addReading(24.0);
        List<Sensor> testList = List.of(s1, s2);
        Map<Integer, Double> expected = new HashMap<>();
        expected.put(1, 20.0);
        expected.put(2, 24.0);
        assertEquals(expected, SensorAnalyzer.getLatestReadingsGroupedByType(testList));
    }
}
