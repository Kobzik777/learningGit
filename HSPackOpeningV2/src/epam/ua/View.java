package epam.ua;

/**
 * Created by Кобзарь on 08/12/2016.
 */
public class View {
    public static String PROCESSING = "Processing...";
    public static String BLUE_COUNT = "Number of rare cards: ";
    public static String WHITE_COUNT = "Number of common cards: ";
    public static String LILA_COUNT = "Number of epic cards: ";
    public static String ORANGE_COUNT = "Number of legendary cards: ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void concatAndPrint(String... message) {
        StringBuilder scr = new StringBuilder();
        StringBuilder concatString = null;
        for (String v : message) {
            concatString = scr.append(v);
        }
        printMessage(new String(concatString));
    }
}
