package sdp.abstractfactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        GUIFactory factory = new MacFactory();
        Button button = factory.createButton();
        Window window = factory.createWindow();

        button.paint();
        window.open();
    }
}

