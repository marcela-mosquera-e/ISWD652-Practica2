package ec.edu.epn.calidadsw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLogin extends BasePage{
    // Declaración de localizadores protegidos para los elementos de la página
    protected By InputEmail = By.id("email");
    protected By InputPassword = By.id("pass");

    // Declaración de localizador público para el botón de inicio de sesión
    public By ButtonLogin = By.xpath("//button[@id='send2']/span[contains(text(),'Sign In')]");

    // Declaración de localizador protegido para el botón de creación de cuenta
    protected By ButtonCreateAnAccount = By.xpath("//a[@class='action create primary' and span[text()='Create an Account']]");

    /**
     * Constructor de la clase CustomerLogin
     * @param driver WebDriver utilizado para interactuar con el navegador
     */
    public CustomerLogin(WebDriver driver) {
        super(driver);
    }

/**
 * Métodos de la clase CustomerLogin
 */

    /**
     * Navega a la página para registrar una nueva cuenta
     */
    public void goToRegisterNewAccount() {
        click(ButtonCreateAnAccount);
    }

    /**
     * Rellena el formulario de inicio de sesión con el correo electrónico y la contraseña proporcionados
     * @param email Correo electrónico del usuario
     * @param password Contraseña del usuario
     */
    public void fillOutLoginForm(String email, String password) {
        type(InputEmail, email);
        type(InputPassword, password);
    }

    /**
     * Hace clic en el botón de inicio de sesión
     */
    public void clickLoginButton() {
        click(ButtonLogin);
    }

}
