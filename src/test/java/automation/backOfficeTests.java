package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

import java.util.List;

public class backOfficeTests extends BaseTest {

    @Test
    public void ingresotest() {
        rellenarFormularioLogin("pruebapdteat", "*mtt2024");

        //sleep(5000);

        Logs.info("Buscando elementos del dashboard Bandeja de entrada");
        final var bandejaEntrada =
                driver.findElement(By.xpath("//a[span[text()='Bandeja de entrada']]"));

        Logs.info("Buscando elementos del dashboard Administración");
        final var administracion =
                driver.findElement(By.xpath("//a[span[text()='Administración']]"));

        Logs.info("Buscando elementos del dashboard Revisión empresas");
        final var empresas =
                driver.findElement(By.xpath("//a[span[text()='Revisión empresas']]"));

        Logs.info("Buscando elementos del dashboard revisión vehiculos");
        final var vehiculos =
                driver.findElement(By.xpath("//a[span[text()='Revisión Vehículos']]"));

        Logs.info("Buscando elementos del dashboard Revision Conductores");
        final var conductores =
                driver.findElement(By.xpath("//a[span[text()='Revisión Conductores']]"));

        Logs.info("Buscando elementos del dashboard configuración");
        final var config =
                driver.findElement(By.xpath("//a[span[text()='Configuración']]"));

        Logs.info("Buscando elementos del dashboard Mantenedores");
        final var mantenedores =
                driver.findElement(By.xpath("//button[.//span[text()='Mantenedores']]"));


        Logs.info("Buscando elementos del dashboard Soporte");
        final var soporte =
                driver.findElement(By.xpath("//a[span[text()='Soporte']]"));

        Logs.info("Buscando elementos del dashboard cerrar sesión");
        final var logOut =
                driver.findElement(By.xpath("//a[span[text()='Cerrar sesión']]"));


        // Validaciones
        Logs.info("valiando que bandeja entrada is displayed");
        softAssert.assertTrue(bandejaEntrada.isDisplayed(),
                "Elemento bandeja entrada en Navbar no está visible");


        Logs.info("valiando que administracipon is displayed");
        softAssert.assertTrue(administracion.isDisplayed(),
                "Elemento Administración en Navbar  no está visible");

        Logs.info("valiando que bandeja entrada is displayed");
        softAssert.assertTrue(empresas.isDisplayed(),
                "El elemento Revisión Empresas en Navbar no está visible.");

        Logs.info("valiando que vehiculos is displayed");
        softAssert.assertTrue(vehiculos.isDisplayed(),
                "Elemento vehiculos en Navbar  no está visible");

        Logs.info("valiando que conductores is displayed");
        softAssert.assertTrue(conductores.isDisplayed(),
                "Elemento conductores en Navbar  no está visible");

        Logs.info("valiando que configuracion is displayed");
        softAssert.assertTrue(config.isDisplayed(),
                "Elemento configuración en Navbar  no está visible");

        Logs.info("valiando que mantenedores is displayed");
        softAssert.assertTrue(mantenedores.isDisplayed(),
                "Elemento Administración en Navbar  no está visible");

        Logs.info("valiando que soporte is displayed");
        softAssert.assertTrue(soporte.isDisplayed(),
                "Elemento soporte en Navbar  no está visible");

        Logs.info("valiando que logOut is displayed");
        softAssert.assertTrue(logOut.isDisplayed(),
                "Elemento logOut en Navbar  no está visible");

        System.out.printf("Todos los elementos son visibles en la Navbar");


    }

    @Test
    public void aprobaciontest() {
        rellenarFormularioLogin("pruebapdteat", "*mtt2024");

        Logs.info("buscando select de perfiles");
        final var dropdown = driver.findElement(By.cssSelector("select"));
        Select select = new Select(dropdown);

        Logs.info("seleccionando analista DNO");
        select.selectByVisibleText("Analista DNO");

        sleep(5000);

        Logs.info("buscando elemento tomar caso");
        final var uberTest = driver.findElement(By.xpath(
                "//h3[contains(text(), 'UBER TEST')]/ancestor::div[contains(@class, " +
                        "'justify-between')]//button[text()='Tomar']"
        ));

        // Hacer scroll hasta el botón
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", uberTest);

        Logs.info("haciendo click en tomar caso");
        uberTest.click();

        sleep(3000);

        Logs.info("buscando elemento para cerrar modal");
        final var botonCerrar = driver.findElement(By.xpath("//button[text()='Cerrar']"));

        Logs.info("haciendo click en cerrar modal");
        botonCerrar.click();

        sleep(10000);

        /*inal var verDocumentos =
                driver.findElement(By.xpath("//button[text()='Ver documento']"));

        verDocumentos.click();

        sleep(1000);

        final var confirmar =
                driver.findElement(By.xpath("//button[normalize-space(text())='Confirmar']"));
        confirmar.click();

        sleep(2000);

         */

        // Espera a que los elementos estén presentes, puedes usar WebDriverWait si quieres más robustez
        List<WebElement> verDocumentosButtons =
                driver.findElements(By.xpath("//button[text()='Ver documento']"));

        for (int i = 0; i < verDocumentosButtons.size(); i++) {
            // Reobtenemos la lista cada vez, porque el DOM puede cambiar después del click
            List<WebElement> botones = driver.findElements(By.xpath("//button[text()='Ver documento']"));

            WebElement boton = botones.get(i);
            boton.click();

            sleep(1000); // Espera tras hacer clic en "Ver documento"

            WebElement confirmar =
                    driver.findElement(By.xpath("//button[normalize-space(text())='Confirmar']"));
            confirmar.click();

            sleep(2000); // Espera después de confirmar
        }


        final var radioAprobado =
                driver.findElement(By.cssSelector("input[type='radio'][value='Aprobado']"));
        radioAprobado.click();

        // 1. Seleccionar radio button "Con plantilla"
        final var radioConPlantilla =
                wait.until(ExpectedConditions.elementToBeClickable(
                        By.cssSelector("input[type='radio'][value='con_plantilla']")));
        radioConPlantilla.click();

        // 2. Esperar a que aparezca el <select>
        final var selectElement =
                driver.findElement(By.cssSelector("select.limitSelect"));

        // 3. Seleccionar opción por valor: "REGISTRO_EAT"
        Select newDropdown = new Select(selectElement);
        newDropdown.selectByValue("REGISTRO_EAT");

        sleep(10000);


    }

    @Test
    public void liberartest() {
        rellenarFormularioLogin("pruebapdteat", "*mtt2024");

        Logs.info("buscando select de perfiles");
        final var dropdown = driver.findElement(By.cssSelector("select"));
        Select select = new Select(dropdown);

        Logs.info("seleccionando analista DNO");
        select.selectByVisibleText("Analista DNO");

        sleep(1000);

        Logs.info("buscando elemento liberar caso");
        final var liberarCaso = driver.findElement(By.xpath(
                "//h3[contains(text(), 'UBER TEST')]/ancestor::div[contains(@class, " +
                        "'justify-between')]//button[text()='Liberar']"
        ));

        // Hacer scroll hasta el botón
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", liberarCaso);

        Logs.info("haciendo click en tomar caso");
        liberarCaso.click();

        sleep(1000);

        Logs.info("buscando elemento para cerrar modal");
        final var botonCerrar = driver.findElement(By.xpath("//button[text()='Cerrar']"));

        Logs.info("haciendo click en cerrar modal");
        botonCerrar.click();

        sleep(1000);


    }

    private void rellenarFormularioLogin(String username, String password) {

        final var urlAnalistas = "https://pdt-eat-analistas-dev.subtrans.gob.cl/login";

        Logs.info("Navegando a : %s", urlAnalistas);
        driver.get(urlAnalistas);

        Logs.info("Escribiendo Username");
        final var userInput =
                driver.findElement(By.id("email"));
        userInput.sendKeys(username);

        Logs.info("Escrbiendo password");
        final var passwordInput =
                driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);

        Logs.info("Haciendo click en iniciar sesión");
        final var iniciarSesion =
                driver.findElement(By.xpath("//button[contains(text(), 'Iniciar sesión')]"));
        iniciarSesion.click();


    }


}

