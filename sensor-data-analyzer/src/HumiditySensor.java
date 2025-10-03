public class HumiditySensor extends Sensor {
    public HumiditySensor(int id) {
        super(id);
    }

    @Override
    public String sensorType() {
        return "Humidity";
    }

    @Override
    public void addReading(double value) {
        super.addReading(value);
    }

    @Override
    public String toString() {
        return sensorType() + " " + getLatestReading();
    }
}
