package just_test.localize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizeTest {
    PrintWriter printWriter = new PrintWriter(System.out, true);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Locale currentLocale = Locale.US;
    ResourceBundle messages = ResourceBundle.getBundle("just_test.localize.bundles.MessagesBundle");

    DateTimeFormatter formatter;

    public void run(){
        String cmd = "";

        while (!cmd.equals("q")) {
            this.printMenu();
            try {
                cmd = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            switch (cmd) {
                case "1":
                    setLang(Locale.US);
                    break;
                case "2":
                    setLang(Locale.GERMANY);
                    break;
                case "3":
                    setLang(new Locale("ru", "RU"));
                    break;
                default:
                    System.out.println("wrong command");
            }
        }


    }

    private void setLang(Locale loc) {
        currentLocale = loc;
        messages = ResourceBundle.getBundle("just_test.localize.bundles.MessagesBundle", currentLocale);
    }

    public void printMenu() {
        showDate(LocalDateTime.now());
        printWriter.println("\n1: " + messages.getString("menu1"));
        printWriter.println("\n1: " + messages.getString("menu2"));
        printWriter.println("\n1: " + messages.getString("menucommand"));

    }

    private void showDate(LocalDateTime now) {
        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(currentLocale);
        printWriter.println(messages.getString("formatFULL") + " " + now.format(formatter));

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(currentLocale);
        printWriter.println(messages.getString("formatMEDIUM") + " " + now.format(formatter));

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(currentLocale);
        printWriter.println(messages.getString("formatSHORT") + " " + now.format(formatter));

    }

    public static void main(String[] args) {
        new LocalizeTest().run();
    }
}
