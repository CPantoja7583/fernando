package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

public class oficinasTests extends BaseTest {
    @Test
    public void logintest() {
        rellenarFormularioLogin("193749658", "Concordia2024!");


        final var reposiciones =
                driver.findElement(By.cssSelector("a.nav-link[title='Reposiciones']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(reposiciones).click().perform();


        final var gestorDocumental =
                driver.findElement(By.xpath("//a[text()='Gestor Documental Reposiciones']"));

        gestorDocumental.click();

        final var fotografiaReposiciones =
                driver.findElement(By.xpath("//a[text()='Fotografía Reposiciones']"));

        fotografiaReposiciones.click();

        sleep(4000);


    }

    @Test
    public void navtest() {
        rellenarFormularioLogin("193749658", "Concordia2024!");

        final var revalidacion =
                driver.findElement(By.cssSelector("a.nav-link[title='Revalidacion']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(revalidacion).click().perform();


        final var cargaBaseRevalidacion =
                driver.findElement(By.xpath("//a[text()='Carga Base Revalidación']"));

        cargaBaseRevalidacion.click();

        final var ingresoRevalidacion =
                driver.findElement(By.xpath("//a[text()='Carga Base Revalidación']"));

        ingresoRevalidacion.click();

        sleep(4000);

    }

    @Test
    public void otrasAtencionestest() {
        rellenarFormularioLogin("193749658", "Concordia2024!");

        final var otrasAtenciones =
                driver.findElement(By.cssSelector("a.nav-link[title='Otras Atenciones']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(otrasAtenciones).click().perform();


        final var actualizacion =
                driver.findElement(By.xpath("//a[text()='Actualización']"));

        actualizacion.click();

        final var cargaSige =
                driver.findElement(By.xpath("//a[text()='Carga SIGE']"));

        cargaSige.click();

        final var prestamoCambioTemporal =
                driver.findElement(By.xpath("//a[text()='Pretamo / Cambio Temporal']"));

        prestamoCambioTemporal.click();

        final var traspasodeSaldos =
                driver.findElement(By.xpath("//a[text()='Traspaso de Saldos']"));

        traspasodeSaldos.click();

        final var devolucionDepositos =
                driver.findElement(By.xpath("//a[text()='Devolución Depositos']"));

        devolucionDepositos.click();

        sleep(4000);


    }

    @Test
    public void stocktest() {
        rellenarFormularioLogin("193749658", "Concordia2024!");

        final var stock =
                driver.findElement(By.cssSelector("a.nav-link[title='Stock']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(stock).click().perform();

        final var recepcionSellos =
                driver.findElement(By.xpath("//a[text()='Recepción Sellos']"));

        recepcionSellos.click();

        final var asignacionSellosOficina =
                driver.findElement(By.xpath("//a[text()='Asignación Sellos Oficina']"));

        asignacionSellosOficina.click();

        final var cuadraturaSellos =
                driver.findElement(By.xpath("//a[text()='Cuadratura Sellos']"));

        cuadraturaSellos.click();

        final var registroSellosMermados =
                driver.findElement(By.xpath("//a[text()='Registro Sellos Mermados']"));

        registroSellosMermados.click();

        final var recepcionTarjetasNoPersonalizadas =
                driver.findElement(By.xpath("//a[text()='Recepción Tarjetas No Personalizadas']"));

        recepcionTarjetasNoPersonalizadas.click();

        final var recepcionTarjetasReposicionesNormales =
                driver.findElement(By.xpath("//a[text()='Recepción Tarjetas Reposiciones Normales']"));

        recepcionTarjetasReposicionesNormales.click();

        final var asignarOficinaTarjetaCentral =
                driver.findElement(By.xpath("//a[text()='Asignar oficina tarjeta central']"));

        asignarOficinaTarjetaCentral.click();

        final var asignarOficinaTarjetaNormal =
                driver.findElement(By.xpath("//a[text()='Asignar oficina tarjeta normal']"));

        asignarOficinaTarjetaNormal.click();


        sleep(4000);

    }

    @Test
    public void stockTemporalestest() {

        rellenarFormularioLogin("193749658", "Concordia2024!");

        final var stockTemporales =
                driver.findElement(By.cssSelector("a.nav-link[title='Stock Temporales']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(stockTemporales).click().perform();

        final var cargaStockCentral =
                driver.findElement(By.xpath("//a[text()='Carga Stock Central']"));

        cargaStockCentral.click();

        final var asignacionStockOficina =
                driver.findElement(By.xpath("//a[text()='Asignación Stock Oficina']"));

        asignacionStockOficina.click();

        final var recepStockOficina =
                driver.findElement(By.xpath("//a[text()='Recep. Stock Oficina']"));

        recepStockOficina.click();

        final var temporales =
                driver.findElement(By.xpath("//a[text()='Temporales']"));

        temporales.click();

        final var cargaSolicitudReposiciones =
                driver.findElement(By.xpath("//a[text()='Carga Solicitud Reposiciones']"));

        cargaSolicitudReposiciones.click();

        final var cuadraturaTemporales =
                driver.findElement(By.xpath("//a[text()='Cuadratura Temporales']"));

        cuadraturaTemporales.click();

        final var arqueoTempBloqueados =
                driver.findElement(By.xpath("//a[text()='Arqueo Temp. Bloqueados']"));

        arqueoTempBloqueados.click();

        sleep(4000);


    }

    @Test
    public void stockNuevostest() {
        rellenarFormularioLogin("193749658", "Concordia2024!");

        final var stockNuevos =
                driver.findElement(By.cssSelector("a.nav-link[title='Stock Nuevos']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(stockNuevos).click().perform();
        /*

        final var cargaStockCentral =
                driver.findElement(By.xpath("//a[text()='Carga Stock Central']"));

        cargaStockCentral.click();

        final var asignacionStockOficina =
                driver.findElement(By.xpath("//a[text()='Asignación Stock Oficina']"));

        asignacionStockOficina.click();

        final var recepStockOficina =
                driver.findElement(By.xpath("//a[text()='Recep. Stock Oficina']"));

        recepStockOficina.click();

        final var temporales =
                driver.findElement(By.xpath("//a[text()='Temporales']"));

        temporales.click();

        final var cargaSolicitudReposiciones =
                driver.findElement(By.xpath("//a[text()='Carga Solicitud Reposiciones']"));

        cargaSolicitudReposiciones.click();

        final var cuadraturaTemporales =
                driver.findElement(By.xpath("//a[text()='Cuadratura Temporales']"));

        cuadraturaTemporales.click();

        final var arqueoTempBloqueados =
                driver.findElement(By.xpath("//a[text()='Arqueo Temp. Bloqueados']"));

        arqueoTempBloqueados.click();

        sleep(4000);

         */


    }

    @Test
    public void softAssertStockTemporalestest() {
        rellenarFormularioLogin("193749658", "Concordia2024!");

        final var stockTemporales =
                driver.findElement(By.cssSelector("a.nav-link[title='Stock Temporales']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(stockTemporales).click().perform();

        final var cargaStockCentral =
                driver.findElement(By.xpath("//a[text()='Carga Stock Central']"));

        final var asignacionStockOficina =
                driver.findElement(By.xpath("//a[text()='Asignación Stock Oficina']"));

        final var recepStockOficina =
                driver.findElement(By.xpath("//a[text()='Recep. Stock Oficina']"));

        final var temporales =
                driver.findElement(By.xpath("//a[text()='Temporales']"));

        final var cargaSolicitudReposiciones =
                driver.findElement(By.xpath("//a[text()='Carga Solicitud Reposiciones']"));

        final var cuadraturaTemporales =
                driver.findElement(By.xpath("//a[text()='Cuadratura Temporales']"));

        final var arqueoTempBloqueados =
                driver.findElement(By.xpath("//a[text()='Arqueo Temp. Bloqueados']"));


        softAssert.assertTrue(cargaStockCentral.isDisplayed(),
                "Carga Stock Central no es visible");

        softAssert.assertTrue(asignacionStockOficina.isDisplayed(),
                "Asignación Stock Oficina no es visible");

        softAssert.assertTrue(recepStockOficina.isDisplayed(),
                "Recep. Stock Oficina no es visible");

        softAssert.assertTrue(temporales.isDisplayed(),
                "Temporales no es visible");

        softAssert.assertTrue(cargaSolicitudReposiciones.isDisplayed(),
                "Carga Solicitud Reposiciones no es visible");

        softAssert.assertTrue(cuadraturaTemporales.isDisplayed(),
                "Cuadratura Temporales no es visible");

        softAssert.assertTrue(arqueoTempBloqueados.isDisplayed(),
                "Arqueo Temp. Bloqueados no es visible");

        softAssert.assertAll();

        System.out.println("✅ Todos los elementos de la navbar son visibles.");


    }

    private void rellenarFormularioLogin(String username, String password) {

        final var oficinasURL = "https://qa-oficina.tarjetaestudiante.com/";

        Logs.info("Ingresado a portal de oficinas");
        driver.get(oficinasURL);

        sleep(2000);

        final var rutInput = driver.findElement(By.id("userid"));
        final var passwordInput = driver.findElement(By.id("pass"));
        final var loginButton = driver.findElement(By.cssSelector("button.btn.btn-primary"));

        rutInput.sendKeys(username);
        passwordInput.sendKeys(password);

        Actions actions = new Actions(driver);
        actions.moveToElement(loginButton).click().perform();

        sleep(1000);

        final var hamburguesaMenus =
                driver.findElement(By.cssSelector("button.button-menu-mobile"));

        hamburguesaMenus.click();


    }
}
