package homeworKu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadWeb {
    public static void main(String[] args) {
        try {
            System.out.println("Введите URL Web-страницы:");
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String urlInput = consoleReader.readLine();

            URL url = new URL(urlInput);
            String webpageContent = downloadWebPage(url);

            System.out.println(webpageContent);

        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.err.println("Неверный URL");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Ошибка при загрузке данных");
        }
    }

    private static String downloadWebPage(URL url) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder content = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }

        reader.close();
        return content.toString();
    }
}