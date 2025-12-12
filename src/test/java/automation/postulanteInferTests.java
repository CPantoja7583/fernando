package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

import java.time.Duration;

public class postulanteInferTests extends BaseTest {

    @Test
    public void ingresotest() {

        final var infer = "https://qa-reclutamiento.examinador.cl/";

        Logs.info("Navegando a : %s", infer);
        driver.get(infer);

        Logs.info("buscando elemenento examinador regular");
        final var examinadorRegular =
                driver.findElement(By.cssSelector("button.accordion-button[data-bs-target='#collapse0']"));

        /*Logs.info("scroll en pagina y click");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'})", examinadorRegular);
         */

        Logs.info("scroll en pagina y click");
        Actions actions = new Actions(driver);
        actions.moveToElement(examinadorRegular).perform();

        sleep(2000);

        Logs.info("scroll en pagina y click");
        actions.moveToElement(examinadorRegular).perform();

        Logs.info("pagina y click");
        examinadorRegular.click();


        Logs.info("buscando elemento postula aquí ");
        final var postulaAqui =
                driver.findElement(By.xpath("//a[text()='Postula Aquí']"));

        sleep(2000);

        Logs.info("Click en elemento");
        actions.moveToElement(postulaAqui).click().build().perform();

        // Espera a que el campo esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        final var rutInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rut")));
        rutInput.sendKeys("180581707");

        final var body = driver.findElement(By.tagName("body"));
        body.click();  // o usar actions.click(body).perform();

        // 2. Esperar que el campo tenga clase 'is-valid'
        wait.until(ExpectedConditions.attributeContains(By.id("rut"), "class", "is-valid"));

        final var serieInput =
                wait.until(ExpectedConditions.elementToBeClickable(By.id("numeroSerie")));
        serieInput.sendKeys("528768124");

        final var btnCaptureFrontal =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnCaptureFrontal")));

        actions.moveToElement(btnCaptureFrontal).click().build().perform();

        final var fileInput =
                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("file")));
        fileInput.sendKeys("src/test/resources/imagenes/ciDelantero.jpeg");

        final var rotateButton =
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-action='rotate-left']")));
        rotateButton.click();


        final var confirmCrop =
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-action='crop']")));
        confirmCrop.click();


        sleep(10000);


    }

    @Test
    public void examinadorDiscapacidadSensorialtest() {
        final var infer = "https://qa-reclutamiento.examinador.cl/";

        Logs.info("Navegando a : %s", infer);
        driver.get(infer);

        // Espera a que el campo esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        final var rutInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rut")));

        // Escribe un RUT válido (ejemplo)
        rutInput.sendKeys("180581707");


        final var serieInput =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numeroSerie")));

        serieInput.sendKeys("528768124");

        final var btnCaptureFrontal =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnCaptureFrontal")));

        Actions actions = new Actions(driver);
        actions.moveToElement(btnCaptureFrontal).click().build().perform();

        sleep(10000);


    }
}