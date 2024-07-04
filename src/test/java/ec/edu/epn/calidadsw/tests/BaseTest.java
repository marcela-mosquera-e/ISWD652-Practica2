package ec.edu.epn.calidadsw.tests;

import ec.edu.epn.calidadsw.pages.HomePage;
import ec.edu.epn.calidadsw.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    // Declaración de variables protegidas para WebDriver y páginas relacionadas
    protected WebDriver driver;
    protected RegisterPage registerPage;
    protected HomePage homePage;

    // Método de configuración que se ejecuta antes de cada método de prueba
    @BeforeMethod
    public void setUp() {
        // Inicializa el WebDriver utilizando ChromeDriver
        driver = new ChromeDriver();
        // Inicializa las instancias de RegisterPage y HomePage, pasando el WebDriver
        registerPage = new RegisterPage(driver);
        homePage = new HomePage(driver);
    }

    // Método de limpieza que se ejecuta después de cada método de prueba
    @AfterMethod
    public void tearDown() {
        // Cierra el WebDriver si no es nulo
        if (driver != null) {
            driver.quit();
        }
    }


}
