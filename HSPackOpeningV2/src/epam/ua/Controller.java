package epam.ua;

/**
 * Created by Кобзарь on 08/12/2016.
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() throws InterruptedException {
        openThePacks();

    }

    public void openThePacks() throws InterruptedException {

        view.printMessage(View.PROCESSING);

        model.openPacks(10);

        view.printMessage(View.WHITE_COUNT + model.getWhitecount());
        view.printMessage(View.BLUE_COUNT + model.getBluecount());
        view.printMessage(View.LILA_COUNT + model.getLilacount());
        view.printMessage(View.ORANGE_COUNT + model.getOrangecount());
    }
}
