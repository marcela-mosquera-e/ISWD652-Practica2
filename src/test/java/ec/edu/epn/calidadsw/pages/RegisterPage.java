package ec.edu.epn.calidadsw.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class RegisterPage extends BasePage {

    protected WebDriver driver;
    protected Faker faker;
    public String expected_title = "Account Information";

    /*
     * Web Elements
     *
     *  */
    protected By firstname = By.id("firstname");
    protected By lastname = By.id("lastname");
    protected By email = By.id("email_address");
    protected By password = By.id("password");
    protected By repassword = By.id("password-confirmation");
    protected By btnRegister = By.xpath("//*[@id='form-validate']/div/div/button");
    public By msgVerify = By.xpath("//div[@class='block-title']//strong[text()='Account Information']");

        public RegisterPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    public void fillOutRegisterFormWithFakeData() {
        faker = new Faker(new Locale("en-US"));
        String fakeEmail = faker.internet().emailAddress();
        String fakepass = faker.internet().password(8, 12, true, true, true);

        type(firstname, faker.address().firstName());
        type(firstname, faker.address().firstName());
        type(lastname, faker.address().lastName());
        type(email, fakeEmail);
        type(password, fakepass);
        type(repassword, fakepass);
        System.out.println("Email is:" + fakeEmail + " Password is:" + fakepass);
    }

    public void fillOutRegisterFormWithRepeatDataBP() {
        faker = new Faker(new Locale("en-US"));
        String fakeEmail = faker.internet().emailAddress();
        String fakepass = faker.internet().password(8, 12, true, true, true);

        type(firstname, faker.address().firstName());
        type(firstname, faker.address().firstName());
        type(lastname, faker.address().lastName());
        type(email, fakeEmail);
        type(password, fakepass);
        type(repassword, fakepass);
        System.out.println("Email is:" + fakeEmail + " Password is:" + fakepass);
    }

    public void clickRegister() {
        submit(btnRegister);
    }

}
