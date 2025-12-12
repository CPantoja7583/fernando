package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

import java.util.Arrays;
import java.util.List;

public class inferLogisticaTests extends BaseTest {

    @Test
    public void loginExiosotest() {
        rellenarFormularioLogin("cpan9112@gmail.com", "123");

        final var jefeOperaciones =
                driver.findElement(By.xpath("//label[contains(., 'Jefe de operaciones (CO)')]"));

        final var continuar =
                driver.findElement(By.xpath("//button[normalize-space(text())='Continuar']"));

        jefeOperaciones.click();
        continuar.click();

        final var sincronizarPersonal =
                driver.findElement(By.xpath("//a[normalize-space()='Sincronizar Personal Reclutamiento']"));
        sincronizarPersonal.click();

        /*final var contrato =
                driver.findElement(By.xpath("//a[normalize-space()='Contrato']"));
        contrato.click();

         */


        sleep(10000);
    }

    @Test
    public void loginAdmintest() {
        rellenarFormularioLogin("cpantoja@concordia.cl", "123");

        //validar ingreso correcto a web

        final var coreTab = driver.findElement(By.id("tab-core"));

        // 5. Validar que está visible usando Assert
        Assert.assertTrue(coreTab.isDisplayed(), "El tab 'Core' no se encontró después del login.");
        System.out.println("\n🎉 Login exitoso ");

        final var logoutButton =
                driver.findElement(By.cssSelector("button[title='Cerrar sesión']"));
        logoutButton.click();

        final var rutInput = driver.findElement(By.id("email"));
        final var passwordInput = driver.findElement(By.id("password"));
        final var loginButton = driver.findElement(By.cssSelector("button.btn.btn-primary"));

        // 3. Validar que todos los elementos estén visibles
        Assert.assertTrue(rutInput.isDisplayed(), "Campo Email no visible");
        Assert.assertTrue(passwordInput.isDisplayed(), "Campo Password no visible");
        Assert.assertTrue(loginButton.isDisplayed(), "Botón Login no visible");

        System.out.println("\n🎉 Logout Exitoso ");
        System.out.println("\n🎉 Login Visible ");
    }

    @Test
    public void loginSupervisortest() {
        rellenarFormularioLogin("cpan9112@gmail.com", "123");

        final var supervisor =
                driver.findElement(By.xpath("//label[contains(., ' Supervisor ')]"));

        final var continuar =
                driver.findElement(By.xpath("//button[normalize-space(text())='Continuar']"));

        supervisor.click();
        continuar.click();

        //validar ingreso correcto a web

        final var portalTab = driver.findElement(By.id("tab-portal"));

        // 5. Validar que está visible usando Assert
        Assert.assertTrue(portalTab.isDisplayed(), "El tab 'portal' no se encontró después del login.");
        System.out.printf("\n🎉 Login Exitoso");

        final var logoutButton =
                driver.findElement(By.cssSelector("button[title='Cerrar sesión']"));
        logoutButton.click();

        sleep(800);

        final var rutInput = driver.findElement(By.id("email"));
        final var passwordInput = driver.findElement(By.id("password"));
        final var loginButton = driver.findElement(By.cssSelector("button.btn.btn-primary"));

        // 3. Validar que todos los elementos estén visibles
        Assert.assertTrue(rutInput.isDisplayed(), "Campo Email no visible");
        Assert.assertTrue(passwordInput.isDisplayed(), "Campo Password no visible");
        Assert.assertTrue(loginButton.isDisplayed(), "Botón Login no visible");

        System.out.println("\n🎉 Logout exitoso ");
        System.out.println("\n🎉 Login visible  ");
    }

    @Test
    public void mesaAyudatest() {
        //Sincronizar Personal Reclutamiento->Ver / listar personal
        rellenarFormularioLogin("cpan9112@gmail.com", "123");

        final var mesaAyuda =
                driver.findElement(By.xpath("//label[contains(., 'MesaAyuda')]"));

        final var continuar =
                driver.findElement(By.xpath("//button[normalize-space(text())='Continuar']"));

        mesaAyuda.click();
        continuar.click();

        final var sincronizarPersonal =
                driver.findElement(By.xpath("//a[normalize-space()='Sincronizar Personal Reclutamiento']"));
        sincronizarPersonal.click();
        sleep(800);

        // Lista de roles esperados
        List<String> rolesEsperados = Arrays.asList(
                "Supervisor",
                "Examinador/a Acompañante",
                "Examinador/a DS",
                "Examinador/a Regular"
        );

        boolean todosPresentes = true;

        for (String rol : rolesEsperados) {
            try {
                // Esperar hasta que el texto esté presente en la página
                wait.until(ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//div[@class='list-group-item']" +
                                "//strong[normalize-space(text())='" + rol + "']")
                ));
                System.out.println("✅ Rol encontrado: " + rol);
            } catch (TimeoutException e) {
                System.out.println("❌ Rol NO encontrado: " + rol);
                todosPresentes = false;
            }
        }

        if (todosPresentes) {
            System.out.println("\n🎉 Todos los roles están presentes en la lista.");
        } else {
            System.out.println("\n⚠️ Faltan uno o más roles en la lista.");
        }

        softAssert.assertTrue(todosPresentes, "Faltan uno o más roles en la lista");

        final var logoutButton =
                driver.findElement(By.cssSelector("button[title='Cerrar sesión']"));
        logoutButton.click();

        sleep(800);

        final var rutInput = driver.findElement(By.id("email"));
        final var passwordInput = driver.findElement(By.id("password"));
        final var loginButton = driver.findElement(By.cssSelector("button.btn.btn-primary"));

        // 3. Validar que todos los elementos estén visibles
        Assert.assertTrue(rutInput.isDisplayed(), "Campo Email no visible");
        Assert.assertTrue(passwordInput.isDisplayed(), "Campo Password no visible");
        Assert.assertTrue(loginButton.isDisplayed(), "Botón Login no visible");

        System.out.println("\n🎉 Logout exitoso ");
        System.out.println("\n🎉 Login visible  ");
    }

    @Test
    public void mesaAyuda2test() {
        //Sincronizar Personal Reclutamiento->Sincronizar / importar datos de personal desde fuentes externas
        rellenarFormularioLogin("cpan9112@gmail.com", "123");

        final var jefeOperaciones =
                driver.findElement(By.xpath("//label[contains(., 'MesaAyuda')]"));

        final var continuar =
                driver.findElement(By.xpath("//button[normalize-space(text())='Continuar']"));

        jefeOperaciones.click();
        continuar.click();

        final var sincronizarPersonal =
                driver.findElement(By.xpath("//a[normalize-space()=" +
                        "'Sincronizar Personal Reclutamiento']"));
        sincronizarPersonal.click();

        final var syncButton = driver.findElement(By.id("sync-button"));
        syncButton.click();
        System.out.println("✅ Se hizo clic en el botón 'Obtener Usuarios de Reclutamiento'");
        sleep(1000);

        //pendiente validar modal


    }

    private void rellenarFormularioLogin(String username, String password) {

        final var logisticaBackoffice = "https://qa-logistica.examinador.cl/";

        Logs.info("Ingresado a portal de logísitica BackOffice");
        driver.get(logisticaBackoffice);

        sleep(2000);

        final var rutInput = driver.findElement(By.id("email"));
        final var passwordInput = driver.findElement(By.id("password"));
        final var loginButton = driver.findElement(By.cssSelector("button.btn.btn-primary"));

        rutInput.sendKeys(username);
        passwordInput.sendKeys(password);

        Actions actions = new Actions(driver);
        actions.moveToElement(loginButton).click().perform();

        sleep(1000);


    }


}
