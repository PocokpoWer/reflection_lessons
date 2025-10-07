public record Reading(double value, MyDateTime timestamp) {
    @Override
    public String toString() {
        return String.format("Timestamp: %s Value: %.2f", timestamp, value);
    }
}
