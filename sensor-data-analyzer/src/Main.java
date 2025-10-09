import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyDateTime myDateTime = new MyDateTime(2025, 10, 3, 15, 10);
        TemperatureSensor t1 = new TemperatureSensor(myDateTime, 1);
        t1.addReading(20.5);
        t1.addReading(22.0);
        MyDateTime myDateTime2 = new MyDateTime(2020, 1, 3, 10, 00);
        TemperatureSensor t2 = new TemperatureSensor(myDateTime2, 2);
        t2.addReading(18.0);
        MyDateTime myDateTime3 = new MyDateTime(2018, 5, 3, 9, 20);
        HumiditySensor h1 = new HumiditySensor(myDateTime3, 3);
        h1.addReading(55.0);
        h1.addReading(60.0);
        MyDateTime myDateTime4 = new MyDateTime(2014, 7, 30, 19, 50);
        WindSensor w1 = new WindSensor(myDateTime4, 4);
        w1.addReading(25);

        List<Sensor> list = List.of(t1, t2, h1, w1);
        System.out.println("Átlag celsius: " + SensorAnalyzer.getAverageReading(t1));
        System.out.println("Threshold > 21: " + SensorAnalyzer.getSensorsAboveThreshold(list, 21.0));
        System.out.println("Legnagyobb latest: " + SensorAnalyzer.getSensorWithHighestLatestReading(list));
        System.out.println("Grouped: " + SensorAnalyzer.getLatestReadingsGroupedByType(list));

        CsvExport.exportCsvFile(list, "CsvExporting.csv");
        JsonExport.exportJson(list, "JsonExporting.json");
    }
}