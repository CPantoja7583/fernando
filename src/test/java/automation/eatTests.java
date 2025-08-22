package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

public class eatTests extends BaseTest {

        @Test
        public void logintest() {
                rellenarFormularioLogin("44.444.444-4", "testing");

                Logs.info("buscando elemento inscripción eat");
                final var inscripcionEat = driver
                                .findElement(By.xpath("//div[contains(@class, 'cardHome')]//h2[contains(text(), " +
                                                "'Inscripción de la Empresa')]"));

                Logs.info("click en elemento inscripción eat");
                inscripcionEat.click();

                Logs.info("buscando elemento boton ir al tramite");
                final var botonTramite = driver
                                .findElement(By.xpath("//button[normalize-space(text())='Ir al trámite']"));

                Logs.info("click en  elemento BtnIrAlTramite eat");
                Actions actions = new Actions(driver);
                actions.moveToElement(botonTramite).click().perform();

                sleep(7000);

                /*
                 * final var modal = wait.until(
                 * ExpectedConditions.elementToBeClickable(By.
                 * xpath("//button[contains(text(), 'Aceptar')]"))
                 * );
                 * modal.click();
                 * 
                 * 
                 * 
                 * 
                 * final var rutInput =
                 * driver.findElement(By.cssSelector("input[formcontrolname='rut']"));
                 * 
                 * rutInput.sendKeys("18028170-7");
                 * 
                 * final var razonSocialInput =
                 * driver.findElement(By.cssSelector("input[formcontrolname='razonSocial']"));
                 * 
                 * razonSocialInput.sendKeys("testing");
                 * 
                 */

        }

        @Test
        public void eattest() {

                final var urlFrontend = "https://pdt-eat-frontend-qa.subtrans.gob.cl/tramites";

                Logs.info("Navegando a : %s", urlFrontend);
                driver.get(urlFrontend);

                Logs.info("buscando elemento inscripción eat");
                final var inscripcionEat = driver
                                .findElement(By.xpath("//div[contains(@class, 'cardHome')]//h2[contains(text(), " +
                                                "'Inscripción de la Empresa')]"));

                Logs.info("click en elemento inscripción eat");
                inscripcionEat.click();

                Logs.info("buscando elemento clave única");
                final var claveUnicaBtn = driver.findElement(By.linkText("ClaveÚnica"));

                Actions actions = new Actions(driver);
                actions.moveToElement(claveUnicaBtn).click().perform();

                Logs.info("Escribiendo Username");
                final var runInput = driver.findElement(By.id("uname"));
                runInput.sendKeys("44444444-4");

                Logs.info("Escrbiendo password");
                final var claveInput = driver.findElement(By.id("pword"));
                claveInput.sendKeys("testing");

                Logs.info("Haciendo click en iniciar sesión");
                final var loginButton = driver.findElement(By.id("login-submit"));
                loginButton.click();

                sleep(5000);

                // Manejar modal de advertencia de contraseña débil si aparece
                try {
                        Logs.info("Verificando si aparece modal de advertencia de contraseña");
                        final var modalAceptar = wait.until(
                                        ExpectedConditions.elementToBeClickable(
                                                        By.xpath("//button[contains(text(), 'Aceptar')]")));
                        Logs.info("Modal de advertencia encontrado, haciendo click en Aceptar");
                        modalAceptar.click();
                        sleep(2000);
                } catch (Exception e) {
                        Logs.info("No se encontró modal de advertencia, continuando con el test");
                }

                // Continuar con la navegación después del login
                Logs.info("buscando elemento inscripción eat después del login");
                final var inscripcionEatPostLogin = driver
                                .findElement(By.xpath("//div[contains(@class, 'cardHome')]//h2[contains(text(), " +
                                                "'Inscripción de la Empresa')]"));

                Logs.info("click en elemento inscripción eat después del login");
                inscripcionEatPostLogin.click();

                Logs.info("buscando elemento boton ir al tramite");
                final var botonTramite = driver
                                .findElement(By.xpath("//button[normalize-space(text())='Ir al trámite']"));

                Logs.info("click en elemento BtnIrAlTramite eat");
                Actions actionsPostLogin = new Actions(driver);
                actionsPostLogin.moveToElement(botonTramite).click().perform();

                sleep(7000);

        }

        private void rellenarFormularioLogin(String username, String password) {

                final var urlFrontend = "https://pdt-eat-frontend-qa.subtrans.gob.cl/tramites";

                Logs.info("Navegando a : %s", urlFrontend);
                driver.get(urlFrontend);

                sleep(3000);

                Logs.info("buscando elemento clave única");
                final var claveUnicaBtn = driver.findElement(By.linkText("ClaveÚnica"));

                Actions actions = new Actions(driver);
                actions.moveToElement(claveUnicaBtn).click().perform();

                sleep(3000);

                Logs.info("Escribiendo Username");
                final var runInput = driver.findElement(By.id("uname"));
                runInput.sendKeys(username);

                Logs.info("Escrbiendo password");
                final var claveInput = driver.findElement(By.id("pword"));
                claveInput.sendKeys(password);

                Logs.info("Haciendo click en iniciar sesión");
                final var loginButton = driver.findElement(By.id("login-submit"));
                loginButton.click();

                sleep(5000);

                // Manejar modal de advertencia de contraseña débil si aparece
                try {
                        Logs.info("Verificando si aparece modal de advertencia de contraseña en rellenarFormularioLogin");
                        final var modalAceptar = wait.until(
                                        ExpectedConditions.elementToBeClickable(
                                                        By.xpath("//button[contains(text(), 'Aceptar')]")));
                        Logs.info("Modal de advertencia encontrado en rellenarFormularioLogin, haciendo click en Aceptar");
                        modalAceptar.click();
                        sleep(2000);
                } catch (Exception e) {
                        Logs.info("No se encontró modal de advertencia en rellenarFormularioLogin, continuando con el test");
                }

        }
}
