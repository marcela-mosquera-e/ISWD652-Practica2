package ec.edu.epn.calidadsw.tests;

import ec.edu.epn.calidadsw.utils.Variables;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class RegisterTest extends BaseTest {


    @Test (testName = "TC1-Register New Customer", description = "Registrar un cliente con todos los datos correctos")
    public void registerNewCustomer() {
        // Navega a la página para crear un nuevo cliente
        homePage.goToCreateNewCustomerLink();

        // Rellena el formulario de registro con datos
        registerPage.fillOutRegisterFormWithFakeData();

        // Haz clic en el botón de registro
        registerPage.clickRegister();

        // Espera hasta que aparezca un mensaje de éxito después del registro
        WebElement msg = new WebDriverWait(driver, Duration.ofSeconds(Variables.TIME_OUT))
                .until(ExpectedConditions.presenceOfElementLocated(registerPage.msgVerify));

        // Verifica que el mensaje obtenido coincida con el título esperado
        Assert.assertEquals(msg.getText(), registerPage.expected_title);
    }

}
