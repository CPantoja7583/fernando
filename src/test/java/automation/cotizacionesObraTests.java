package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

public class cotizacionesObraTests extends BaseTest {

    @Test
    public void donHernantest() {
        rellenarFormularioLogin("12125440-9", "Leraca.1976");

        Select combo = new Select(driver.findElement(By.id("seleccion_certificado")));
        combo.selectByValue("1");   // selecciona "Por RUT Trabajador"

        sleep(1000);

        String[] ruts = {
                "19261724-3",
                "13500199-6",
                "16417118-3",
                "20027965-4",
                "19969533-9"
        };

        final var ingresarRut = driver.findElement(By.id("web_rut2"));
        final var agregarRut = driver.findElement(By.id("agregar"));


        for (String rut : ruts) {

            Logs.info("Agregando RUT: " + rut);

            ingresarRut.clear();      // limpiar campo antes de escribir
            ingresarRut.sendKeys(rut);
            agregarRut.click();

        }


        Logs.info("Haciendo click en imprimir certificado");
        final var imprimirCertificado =
                driver.findElement(By.id("imprimirPensiones"));
        imprimirCertificado.click();


        sleep(10000);


    }

    @Test
    public void italquimtest() {
        rellenarFormularioLogin("12125440-9", "Leraca.1976");

        Select combo = new Select(driver.findElement(By.id("seleccion_certificado")));
        combo.selectByValue("1");   // selecciona "Por RUT Trabajador"

        sleep(1000);

        String[] ruts = {
                "19439513-2",
                "21441902-5",
                "5526149-0"
        };

        final var ingresarRut = driver.findElement(By.id("web_rut2"));
        final var agregarRut = driver.findElement(By.id("agregar"));


        for (String rut : ruts) {

            Logs.info("Agregando RUT: " + rut);

            ingresarRut.clear();      // limpiar campo antes de escribir
            ingresarRut.sendKeys(rut);
            agregarRut.click();

        }


        Logs.info("Haciendo click en imprimir certificado");
        final var imprimirCertificado =
                driver.findElement(By.id("imprimirPensiones"));
        imprimirCertificado.click();


        sleep(10000);
    }

    @Test
    public void obraAlsaneotest() {
        rellenarFormularioLogin("12125440-9", "Leraca.1976");

        Select combo = new Select(driver.findElement(By.id("seleccion_certificado")));
        combo.selectByValue("1");   // selecciona "Por RUT Trabajador"

        sleep(1000);

        String[] ruts = {
                "9155215-9",
                "13887950-K",
                "18039173-8"
        };

        final var ingresarRut = driver.findElement(By.id("web_rut2"));
        final var agregarRut = driver.findElement(By.id("agregar"));

        for (String rut : ruts) {

            Logs.info("Agregando RUT: " + rut);

            ingresarRut.clear();      // limpiar campo antes de escribir
            ingresarRut.sendKeys(rut);
            agregarRut.click();

        }

        Logs.info("Haciendo click en imprimir certificado");
        final var imprimirCertificado =
                driver.findElement(By.id("imprimirPensiones"));
        imprimirCertificado.click();

        sleep(10000);
    }

    @Test
    public void alejandratest() {
        rellenarFormularioLogin("12125440-9", "Leraca.1976");

        Select combo = new Select(driver.findElement(By.id("seleccion_certificado")));
        combo.selectByValue("1");   // selecciona "Por RUT Trabajador"

        sleep(1000);

        String[] ruts = {
                "19849673-1"
        };

        final var ingresarRut = driver.findElement(By.id("web_rut2"));
        final var agregarRut = driver.findElement(By.id("agregar"));

        for (String rut : ruts) {

            Logs.info("Agregando RUT: " + rut);

            ingresarRut.clear();      // limpiar campo antes de escribir
            ingresarRut.sendKeys(rut);
            agregarRut.click();

        }

        Logs.info("Haciendo click en imprimir certificado");
        final var imprimirCertificado =
                driver.findElement(By.id("imprimirPensiones"));
        imprimirCertificado.click();

        sleep(10000);
    }

    @Test
    public void sanPedrotest() {
        rellenarFormularioLogin("12125440-9", "Leraca.1976");

        Select combo = new Select(driver.findElement(By.id("seleccion_certificado")));
        combo.selectByValue("1");   // selecciona "Por RUT Trabajador"

        sleep(1000);

        String[] ruts = {
                "21529933-3",
                "11341761-7",
                "23590252-4",
                "8491054-6",
                "14905174-0",
                "15945890-3"
        };

        final var ingresarRut = driver.findElement(By.id("web_rut2"));
        final var agregarRut = driver.findElement(By.id("agregar"));

        for (String rut : ruts) {

            Logs.info("Agregando RUT: " + rut);

            ingresarRut.clear();      // limpiar campo antes de escribir
            ingresarRut.sendKeys(rut);
            agregarRut.click();

        }

        Logs.info("Haciendo click en imprimir certificado");
        final var imprimirCertificado =
                driver.findElement(By.id("imprimirPensiones"));
        imprimirCertificado.click();

        sleep(10000);

    }

    @Test
    public void sanFcotest() {
        rellenarFormularioLogin("12125440-9", "Leraca.1976");

        Select combo = new Select(driver.findElement(By.id("seleccion_certificado")));
        combo.selectByValue("1");   // selecciona "Por RUT Trabajador"

        sleep(1000);

        String[] ruts = {
                "10126738-5",
                "19834296-3",
                "9929578-3",
                "12925103-4",
                "11903671-2",
                "6521358-3",
                "11349992-3"

        };

        final var ingresarRut = driver.findElement(By.id("web_rut2"));
        final var agregarRut = driver.findElement(By.id("agregar"));

        for (String rut : ruts) {

            Logs.info("Agregando RUT: " + rut);

            ingresarRut.clear();      // limpiar campo antes de escribir
            ingresarRut.sendKeys(rut);
            agregarRut.click();

        }

        Logs.info("Haciendo click en imprimir certificado");
        final var imprimirCertificado =
                driver.findElement(By.id("imprimirPensiones"));
        imprimirCertificado.click();

        sleep(10000);
    }

    @Test
    public void talinaytest() {
        rellenarFormularioLogin("12125440-9", "Leraca.1976");

        Select combo = new Select(driver.findElement(By.id("seleccion_certificado")));
        combo.selectByValue("1");   // selecciona "Por RUT Trabajador"

        sleep(1000);

        String[] ruts = {
                "26824210-4",
                "19753387-0",
                "15055112-9",
                "21136547-1"
        };

        final var ingresarRut = driver.findElement(By.id("web_rut2"));
        final var agregarRut = driver.findElement(By.id("agregar"));

        for (String rut : ruts) {

            Logs.info("Agregando RUT: " + rut);

            ingresarRut.clear();      // limpiar campo antes de escribir
            ingresarRut.sendKeys(rut);
            agregarRut.click();

        }

        Logs.info("Haciendo click en imprimir certificado");
        final var imprimirCertificado =
                driver.findElement(By.id("imprimirPensiones"));
        imprimirCertificado.click();

        sleep(10000);
    }

    @Test
    public void tallerestest() {
        rellenarFormularioLogin("12125440-9", "Leraca.1976");

        Select combo = new Select(driver.findElement(By.id("seleccion_certificado")));
        combo.selectByValue("1");   // selecciona "Por RUT Trabajador"

        sleep(1000);

        String[] ruts = {
                "20128875-4",
                "21921867-2",
                "13453736-1",
                "19430086-7",
                "10570254-K",
                "11437367-2",
                "16912141-9",
                "17394258-3"
        };

        final var ingresarRut = driver.findElement(By.id("web_rut2"));
        final var agregarRut = driver.findElement(By.id("agregar"));

        for (String rut : ruts) {

            Logs.info("Agregando RUT: " + rut);

            ingresarRut.clear();      // limpiar campo antes de escribir
            ingresarRut.sendKeys(rut);
            agregarRut.click();

        }

        Logs.info("Haciendo click en imprimir certificado");
        final var imprimirCertificado =
                driver.findElement(By.id("imprimirPensiones"));
        imprimirCertificado.click();

        sleep(10000);
    }

    @Test
    public void talleresDostest() {
        rellenarFormularioLogin("12125440-9", "Leraca.1976");

        Select combo = new Select(driver.findElement(By.id("seleccion_certificado")));
        combo.selectByValue("1");   // selecciona "Por RUT Trabajador"

        sleep(1000);

        String[] ruts = {
                "20057544-K",
                "15389456-6",
                "8830610-4",
                "18848941-9",
                "16277260-0",
                "16147896-2",
                "16435221-8",
                "21268628-K"
        };

        final var ingresarRut = driver.findElement(By.id("web_rut2"));
        final var agregarRut = driver.findElement(By.id("agregar"));

        for (String rut : ruts) {

            Logs.info("Agregando RUT: " + rut);

            ingresarRut.clear();      // limpiar campo antes de escribir
            ingresarRut.sendKeys(rut);
            agregarRut.click();

        }

        Logs.info("Haciendo click en imprimir certificado");
        final var imprimirCertificado =
                driver.findElement(By.id("imprimirPensiones"));
        imprimirCertificado.click();

        sleep(10000);
    }

    @Test
    public void talleresTrestest() {
        rellenarFormularioLogin("12125440-9", "Leraca.1976");

        Select combo = new Select(driver.findElement(By.id("seleccion_certificado")));
        combo.selectByValue("1");   // selecciona "Por RUT Trabajador"

        sleep(1000);

        String[] ruts = {
                "6696488-4",
                "21539788-2",
                "16304474-9",
                "12459258-5",
                "20634939-5",
                "21707940-3",
                "18408787-1",
                "12784130-6"
        };

        final var ingresarRut = driver.findElement(By.id("web_rut2"));
        final var agregarRut = driver.findElement(By.id("agregar"));

        for (String rut : ruts) {

            Logs.info("Agregando RUT: " + rut);

            ingresarRut.clear();      // limpiar campo antes de escribir
            ingresarRut.sendKeys(rut);
            agregarRut.click();

        }

        Logs.info("Haciendo click en imprimir certificado");
        final var imprimirCertificado =
                driver.findElement(By.id("imprimirPensiones"));
        imprimirCertificado.click();

        sleep(10000);
    }


    private void rellenarFormularioLogin(String username, String password) {
        final var urlPrevired = "https://www.previred.com/wPortal/login/login.jsp";

        Logs.info("Navegando a : %s", urlPrevired);
        driver.get(urlPrevired);

        Logs.info("Escribiendo Username");
        final var userInput =
                driver.findElement(By.id("web_rut2"));
        userInput.sendKeys(username);

        Logs.info("Escrbiendo password");
        final var passwordInput =
                driver.findElement(By.id("web_password"));
        passwordInput.sendKeys(password);

        Logs.info("Haciendo click en iniciar sesión");
        final var iniciarSesion =
                driver.findElement(By.id("login"));
        iniciarSesion.click();


        Logs.info("Haciendo click en empresas");
        final var empresas =
                driver.findElement(By.id("empresa"));
        empresas.click();

        sleep(1000);

        Logs.info("Haciendo click en empresa guardias");
        final var empresaGuardias =
                driver.findElement(By.id("empresa#76957714#00#true"));
        empresaGuardias.click();

        sleep(1000);

        Logs.info("Haciendo click en remuneraciones");
        final var remuneraciones =
                driver.findElement(By.id("empresa#76957714#00####"));
        remuneraciones.click();

        sleep(1000);

        Logs.info("Haciendo click en imprimir documentos");
        final var imprimirDocumentos =
                driver.findElement(By.xpath("//a[text()='Imprimir Documentos']"));
        imprimirDocumentos.click();

        Logs.info("Haciendo click en ver certficados");
        final var verCertificados =
                driver.findElement(By.id("ver_certificados"));
        verCertificados.click();

        sleep(1000);

    }


}
