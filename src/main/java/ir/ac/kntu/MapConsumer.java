package ir.ac.kntu;

import java.io.IOException;
import java.util.function.Consumer;

public class MapConsumer implements Consumer<String> {
    @Override
    public void accept(String string) {
        try {
            Runtime.getRuntime().exec("java -jar lib/map-utility-0.0" +
                    ".1-SNAPSHOT.jar " + string.trim().replace("-", ""));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.err.println("Map Started");
        }
    }
}
