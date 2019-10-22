package ir.ac.kntu;

/**
 * @author yourname
 */
public class Main {
    public static void main(String[] args) {
        //Good for showing one location
//        MapConsumer.getInstance().accept("Tehran");
        //Good for showing two locations
        MapConsumer.getInstance().accept("Tehran","Dubai");
    }
}
