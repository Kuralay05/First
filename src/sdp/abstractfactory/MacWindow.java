package sdp.abstractfactory;
public class MacWindow implements Window {
    @Override
    public void open() {
        System.out.println("Opening a window in Mac style.");
    }
}

