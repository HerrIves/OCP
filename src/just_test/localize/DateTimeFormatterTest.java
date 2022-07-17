package just_test.localize;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        for (Locale availableLocale : Locale.getAvailableLocales()) {
            System.out.println(availableLocale + " ");
        }

        LocalDateTime now = LocalDateTime.now();
        Locale fr = Locale.FRANCE;

        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(now.format(df));

        ResourceBundle messages = ResourceBundle.getBundle("just_test/localize/bundles/MessagesBundle");
        System.out.println(messages.getBaseBundleName());
    }
}
