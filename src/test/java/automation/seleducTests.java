package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

public class seleducTests extends BaseTest {

    @Test
    public void examinadorRegulartest() {
        rellenarFormularioLogin("999999999", "123");

        final var capacitacionesMenu =
                driver.findElement(By.linkText("Capacitaciones"));

        Actions actions = new Actions(driver);
        actions.moveToElement(capacitacionesMenu).click().perform();

        final var capacitaciones =
                driver.findElement(By.xpath("//a[text()='Capacitaciones']"));

        capacitaciones.click();

        final var botonAgregar =
                driver.findElement(By.xpath("//a[span[text()='Agregar']]"));

        botonAgregar.click();

        final var dropdown =
                driver.findElement(By.cssSelector(".select2-selection--single"));
        dropdown.click();

        final var opcionRegular =
                driver.findElement(By.xpath("//li[text()='Examinador Regular']"));
        opcionRegular.click();

        final var campoDireccion =
                driver.findElement(By.cssSelector("input#direccion"));
        campoDireccion.sendKeys("Av. Siempre Viva 742");

        final var fechaInput =
                driver.findElement(By.id("fecha"));
        fechaInput.sendKeys("06-10-2025");

        final var horaInicio =
                driver.findElement(By.id("hora_inicio"));
        horaInicio.sendKeys("05:30");

        final var horaFin =
                driver.findElement(By.id("hora_termino"));
        horaFin.sendKeys("06:00");

        final var inputConvocados =
                driver.findElement(By.id("n_convocados"));
        inputConvocados.sendKeys("1");

        final var selectDropdown =
                driver.findElement(By.id("select2-idRecluta-container"));
        selectDropdown.click();

        final var opcionMatias =
                driver.findElement(By.xpath("//li[contains(text(),'Camila Andrea Arancibia Villalobos')]"));
        opcionMatias.click();

        final var botonGuardar =
                driver.findElement(By.id("btnGuardar"));
        botonGuardar.click();

        sleep(500);


    }

    @Test
    public void examinadorDStest() {
        rellenarFormularioLogin("999999999", "123");

        final var capacitacionesMenu =
                driver.findElement(By.linkText("Capacitaciones"));

        Actions actions = new Actions(driver);
        actions.moveToElement(capacitacionesMenu).click().perform();

        final var capacitaciones =
                driver.findElement(By.xpath("//a[text()='Capacitaciones']"));

        capacitaciones.click();

        final var botonAgregar =
                driver.findElement(By.xpath("//a[span[text()='Agregar']]"));

        botonAgregar.click();

        final var dropdown =
                driver.findElement(By.cssSelector(".select2-selection--single"));
        dropdown.click();

        final var opcionDS =
                driver.findElement(By.xpath("//li[text()='Examinador DS']"));
        opcionDS.click();

        final var campoDireccion =
                driver.findElement(By.cssSelector("input#direccion"));
        campoDireccion.sendKeys("Av. Siempre Viva 742");

        final var fechaInput =
                driver.findElement(By.id("fecha"));
        fechaInput.sendKeys("06-10-2025");

        final var horaInicio =
                driver.findElement(By.id("hora_inicio"));
        horaInicio.sendKeys("06:50");

        final var horaFin =
                driver.findElement(By.id("hora_termino"));
        horaFin.sendKeys("07:20");

        final var inputConvocados =
                driver.findElement(By.id("n_convocados"));
        inputConvocados.sendKeys("2");

        final var selectDropdown =
                driver.findElement(By.id("select2-idRecluta-container"));
        selectDropdown.click();

        final var opcionMatias =
                driver.findElement(By.xpath("//li[contains(text(),'Camila Andrea Arancibia Villalobos')]"));
        opcionMatias.click();

        final var botonGuardar = driver.findElement(By.id("btnGuardar"));
        botonGuardar.click();

        sleep(500);


    }

    @Test
    public void acompananteAulatest() {
        rellenarFormularioLogin("999999999", "123");

        final var capacitacionesMenu =
                driver.findElement(By.linkText("Capacitaciones"));

        Actions actions = new Actions(driver);
        actions.moveToElement(capacitacionesMenu).click().perform();

        final var capacitaciones =
                driver.findElement(By.xpath("//a[text()='Capacitaciones']"));

        capacitaciones.click();

        final var botonAgregar =
                driver.findElement(By.xpath("//a[span[text()='Agregar']]"));

        botonAgregar.click();

        final var dropdown =
                driver.findElement(By.cssSelector(".select2-selection--single"));
        dropdown.click();

        final var opcionAula =
                driver.findElement(By.xpath("//li[text()='Acompañante de aula']"));
        opcionAula.click();

        final var campoDireccion =
                driver.findElement(By.cssSelector("input#direccion"));
        campoDireccion.sendKeys("Av. Siempre Viva 742");

        final var fechaInput =
                driver.findElement(By.id("fecha"));
        fechaInput.sendKeys("20-10-2025");

        final var horaInicio =
                driver.findElement(By.id("hora_inicio"));
        horaInicio.sendKeys("08:40");

        final var horaFin =
                driver.findElement(By.id("hora_termino"));
        horaFin.sendKeys("09:10");

        final var inputConvocados =
                driver.findElement(By.id("n_convocados"));
        inputConvocados.sendKeys("2");

        final var selectDropdown =
                driver.findElement(By.id("select2-idRecluta-container"));
        selectDropdown.click();

        final var opcionMatias =
                driver.findElement(By.xpath("//li[contains(text(),'Camila Andrea Arancibia Villalobos')]"));
        opcionMatias.click();

        final var botonGuardar = driver.findElement(By.id("btnGuardar"));
        botonGuardar.click();

        sleep(500);


    }

    @Test
    public void reporteCompletotest() {
        rellenarFormularioLogin("999999999", "123");

        final var reportes =
                driver.findElement(By.linkText("Reportes"));

        reportes.click();

        final var reporteCompleto =
                driver.findElement(By.linkText("Reporte Completo"));

        reporteCompleto.click();

        final var botonExcel =
                driver.findElement(By.cssSelector("a.btn.btn-md.btn-primary.waves-effect.waves-dark"));
        botonExcel.click();

        sleep(5000);

        reporteCompleto.click();

        final var botonDescarga =
                driver.findElement(By.xpath("//a[contains(@href, '.xlsx')]"));
        botonDescarga.click();

        sleep(5000);


    }

    private void rellenarFormularioLogin(String username, String password) {

        final var backOffice = "https://qa-backoffice.postulasimce.cl/dir/";

        Logs.info("Ingresado a portal de BackOffice");
        driver.get(backOffice);

        sleep(2000);

        final var rutInput = driver.findElement(By.id("userid"));
        final var passwordInput = driver.findElement(By.id("pass"));
        final var loginButton = driver.findElement(By.cssSelector("button.btn.btn-primary"));

        rutInput.sendKeys(username);
        passwordInput.sendKeys(password);

        Actions actions = new Actions(driver);
        actions.moveToElement(loginButton).click().perform();

        sleep(1000);


    }

}
