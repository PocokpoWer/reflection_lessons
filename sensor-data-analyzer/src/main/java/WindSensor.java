public class WindSensor extends Sensor {

    public WindSensor(MyDateTime myDateTime, int id) {
        super(myDateTime, id);
    }

    @Override
    public String sensorType() {
        return "Wind";
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
