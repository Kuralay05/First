package sdp;

public class Logger {
    private static Logger instance;
    private Logger() {}
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("я люблю свою семью");
        logger.log("моя семья любит меня");
        Logger anotherLogger = Logger.getInstance();
        if (logger == anotherLogger) {
            logger.log("Оба переменные ссылаются на один и тот же объект Logger.");
        } else {
            logger.log("Переменные ссылаются на разные объекты Logger");
        }
    }
}