import java.util.List;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor t1 = new TemperatureSensor(1);
        t1.addReading(20.5);
        t1.addReading(22.0);
        TemperatureSensor t2 = new TemperatureSensor(2);
        t2.addReading(18.0);
        HumiditySensor h1 = new HumiditySensor(3);
        h1.addReading(55.0);
        h1.addReading(60.0);

        List<Sensor> list = List.of(t1, t2, h1);
        System.out.println("Átlag celsius: " + SensorAnalyzer.getAverageReading(t1));
        System.out.println("Threshold > 21: " + SensorAnalyzer.getSensorsAboveThreshold(list, 21.0));
        System.out.println("Legnagyobb latest: " + SensorAnalyzer.getSensorWithHighestLatestReading(list));
        System.out.println("Grouped: " + SensorAnalyzer.getLatestReadingsGroupedByType(list));
    }
}