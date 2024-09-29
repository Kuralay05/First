package sdp.abstractfactory;
public class WindowsWindow implements Window {
    @Override
    public void open() {
        System.out.println("Opening a window in Windows style.");
    }
}
