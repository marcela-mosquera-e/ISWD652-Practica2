package ec.edu.epn.calidadsw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    // Localizador para el enlace de registro "Create an Account"
    protected By linkRegister = By.linkText("Create an Account");

    // Constructor de la clase HomePage
    public HomePage(WebDriver driver) {
        super(driver);  // Llama al constructor de la clase BasePage con el WebDriver
        this.driver = driver;  // Inicializa el WebDriver
        visit();  // Llama al método visit() para visitar la página de inicio
    }

    /**
     * Navega al enlace para crear una nueva cuenta de cliente.
     * Hace clic en el enlace "Create an Account".
     */
    public void goToCreateNewCustomerLink() {
        click(linkRegister);  // Hace clic en el enlace "Create an Account" usando el método click() definido en BasePage
    }
}
