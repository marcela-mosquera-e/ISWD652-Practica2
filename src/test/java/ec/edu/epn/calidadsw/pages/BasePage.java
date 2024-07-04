package ec.edu.epn.calidadsw.pages;

import ec.edu.epn.calidadsw.tests.BaseTest;
import ec.edu.epn.calidadsw.utils.Variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage extends BaseTest {

    // Declaración de variables de instancia para WebDriver y WebDriverWait
    WebDriver driver;
    WebDriverWait wait;
    int timeOutSec = 10;  // Tiempo de espera por defecto en segundos

    // Constructor de la clase BasePage que inicializa el WebDriver y WebDriverWait
    public BasePage(WebDriver driver) {
        this.driver = driver;
        // Inicializa el WebDriverWait con un tiempo de espera definido por Variables.TIME_OUT
        wait = new WebDriverWait(driver, Duration.ofSeconds(Variables.TIME_OUT));
    }

    // Método para establecer un nuevo valor de tiempo de espera
    public void setTimeOutSec(int timeOutSec) {
        this.timeOutSec = timeOutSec;
    }

    // Método para visitar una página web
    public void visit() {
        // Maximiza la ventana del navegador
        driver.manage().window().maximize();
        // Establece un tiempo de espera implícito para la búsqueda de elementos
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Variables.TIME_OUT));
        // Navega a la URL definida en Variables.BASE_URL
        driver.get(Variables.BASE_URL);
    }

    // Método para encontrar un elemento web usando un localizador By
    public WebElement find(By element) {
        return driver.findElement(element);
    }

    // Método para hacer clic en un elemento web
    public void click(By element) {
        find(element).click();
    }

    // Método para enviar un formulario web
    public void submit(By element) {
        find(element).submit();
    }

    // Método para escribir texto en un campo de entrada
    public void type(By element, String text) {
        find(element).sendKeys(text);
    }

    // Método para verificar si un elemento está visible en la página
    public boolean isDisplay(By locator) {
        try {
            // Espera hasta que el elemento esté visible en la página
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
