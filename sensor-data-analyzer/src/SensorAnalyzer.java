import java.util.*;
import java.util.stream.Collectors;

public class SensorAnalyzer {
    public static double getAverageReading(Sensor sensor) {
        return sensor.getReadings().stream().mapToDouble(Double::doubleValue).average().orElseThrow();
    }

    public static List<Sensor> getSensorsAboveThreshold(List<Sensor> sensors, double threshold) {
        return sensors.stream().filter(s -> !s.getReadings().isEmpty()).filter(sensor -> sensor.getLatestReading() > threshold).collect(Collectors.toList());
    }

    public static Sensor getSensorWithHighestLatestReading(List<Sensor> sensors) {
        return sensors.stream().max(Comparator.comparingDouble(Sensor::getLatestReading)).orElseThrow();
    }

    public static Map<String, Double> getLatestReadingsGroupedByType(List<Sensor> sensors) {
        return sensors.stream().collect(Collectors.toMap(s -> s.sensorType() + ": " + s.getId(),
                Sensor::getLatestReading));
    }
}
