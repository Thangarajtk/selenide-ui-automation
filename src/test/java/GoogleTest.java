import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleTest {

    @Test
    public void testName() {
        open("https://google.com");
        String currentUrl = WebDriverRunner.url();

        assertEquals(currentUrl, "https://www.google.com/");
    }
}
