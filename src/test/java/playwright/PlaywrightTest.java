package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("plw-test")
public class PlaywrightTest {

    @Test
    void executeTest() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chromium").setHeadless(true));
        Page page = browser.newPage();
        page.navigate("https://playwright.dev");
        page.getByText("Playwright enables reliable end-to-end testing for modern web apps.").isVisible();
        playwright.close();
    }
}