public class HumiditySensor extends Sensor {

    public HumiditySensor(MyDateTime myDateTime, int id) {
        super(myDateTime, id);
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
