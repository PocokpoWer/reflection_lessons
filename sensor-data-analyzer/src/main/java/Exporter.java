import java.util.List;

public interface Exporter<T> {
    void fileExporter(List<T> list, String file);
}
