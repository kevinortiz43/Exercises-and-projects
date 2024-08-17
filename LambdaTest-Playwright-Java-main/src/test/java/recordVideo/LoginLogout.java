package recordVideo;

import com.microsoft.playwright.*;
import com.microsoft.playwright.Browser.NewContextOptions;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;

public class LoginLogout {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
				.setHeadless(false));
		BrowserContext context = browser.newContext(
				new NewContextOptions().setRecordVideoDir(Paths.get(
						"C:\\Users\\kevin\\eclipse-workspace\\LambdaTest-Playwright-Java-main\\src\\test\\java/videos1/"))
						.setRecordVideoSize(new RecordVideoSize(1920, 1080)));

		Page page = context.newPage();
		page.navigate("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
		Locator myAccount = page.getByRole(AriaRole.BUTTON,
				new Page.GetByRoleOptions().setName("My account"));
		myAccount.click();
		page.getByPlaceholder("E-Mail Address").fill("Kevin@gmail.com");
		page.getByPlaceholder("Password").fill("Pass123$");
		page.getByRole(AriaRole.BUTTON,
				new Page.GetByRoleOptions().setName("Login"))
				.click();
		page.getByRole(AriaRole.LINK,
				new Page.GetByRoleOptions().setName("Edit your account information")).click();
		page.getByPlaceholder("Last Name").fill("C");
		page.getByRole(AriaRole.BUTTON,
				new Page.GetByRoleOptions()
						.setName("Continue"))
				.click();
		Locator successMessage = page.getByText("Success: Your account has been successfully updated.");
		assertThat(successMessage).isVisible();
		myAccount.hover();
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Logout").setExact(true)).click();
		Locator logoutHeader = page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Account Logout"));
		assertThat(logoutHeader).isVisible();
		page.close();
		context.close();
		browser.close();
		playwright.close();

	}
}