package echo;
import echo.util.JavalinApp;
import sun.awt.windows.WPrinterJob;

public class Main {
    public static void main(String[] args) {
        JavalinApp app = new JavalinApp();
        app.start(80);
        System.out.println("Olá, mundo!");
    }
}
