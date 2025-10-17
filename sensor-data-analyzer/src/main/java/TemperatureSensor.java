public class TemperatureSensor extends Sensor {

    public TemperatureSensor(MyDateTime myDateTime, int id) {
        super(myDateTime, id);
    }

    @Override
    public String sensorType() {
        return "Temperature";
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
