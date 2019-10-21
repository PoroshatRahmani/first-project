package ir.ac.kntu;

import java.io.IOException;
import java.util.function.Consumer;

public class MapConsumer implements Consumer<String> {
    private static MapConsumer INSTANCE = new MapConsumer();

    @Override
    public void accept(String string) {
        try {
            Runtime.getRuntime().exec("java -jar lib/map-utility-0.0" +
                    ".1-SNAPSHOT.jar " + string.trim().replace(" ", "-")
                    + " " +/*Time out:*/ "20000");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.err.println("Map Started");
        }
    }

    public static MapConsumer getInstance() {
        return INSTANCE;
    }

    private MapConsumer() {
    }
}
