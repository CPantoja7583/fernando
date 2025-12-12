package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

public class terrenoTests extends BaseTest {

    @Test
    public void agregarFotografotest() {
        rellenarFormularioLogin("115554360", "Concordia2025!");

        final var administracion =
                driver.findElement(By.cssSelector("a.nav-link[title='Administración']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(administracion).click().perform();

        final var administrarUsuarios =
                driver.findElement(By.linkText("Administrar Usuarios"));
        administrarUsuarios.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        final var agregarBtn =
                driver.findElement(By.xpath("//a[contains(text(),'Agregar')]"));
        actions.moveToElement(agregarBtn).perform();
        js.executeScript("arguments[0].click();", agregarBtn);

        final var removeBtn =
                driver.findElement(By.cssSelector("span.select2-selection__choice__remove"));
        removeBtn.click();

        final var rutInput = driver.findElement(By.id("userid"));
        final var nombres = driver.findElement(By.id("name"));
        final var apellidoPaterno = driver.findElement(By.id("lastn"));
        final var apellidoMaterno = driver.findElement(By.id("lastnm"));
        final var fechaNacimiento = driver.findElement(By.id("birthday"));
        final var telefonoMovil = driver.findElement(By.id("cellphone"));
        final var correoElectronico = driver.findElement(By.id("email"));
        final var direccion = driver.findElement(By.id("address"));
        final var nacionalidad = driver.findElement(By.id("nationality"));
        final var guardar = driver.findElement(By.id("add"));
        final var cargo = driver.findElement(By.id("position"));
        final var horas = driver.findElement(By.id("hours"));


        rutInput.sendKeys("134629002");
        nombres.sendKeys("ROBERTO CARLOS");
        apellidoPaterno.sendKeys("PANTOJA");
        apellidoMaterno.sendKeys("MUÑOZ");
        fechaNacimiento.clear();
        fechaNacimiento.sendKeys("1991-12-15");
        telefonoMovil.sendKeys("936110704");
        correoElectronico.sendKeys("cpantoja@concordia.cl");
        direccion.sendKeys("totoralillo");
        nacionalidad.sendKeys("chileno");
        cargo.sendKeys("Analista");
        horas.sendKeys("20");

        final var campoDropdown = driver.findElement(By.id("select2-state-container"));
        campoDropdown.click();

        final var opcionCoquimbo =
                driver.findElement(By.xpath(
                        "//li[contains(@class, 'select2-results__option') and text()='Coquimbo']"));
        opcionCoquimbo.click();

        final var estadoCivil = driver.findElement(By.id("civil_status"));
        Select selectCivil = new Select(estadoCivil);
        selectCivil.selectByVisibleText("Soltero(a)");

        final var selectSexo = driver.findElement(By.id("sex"));
        Select selectSex = new Select(selectSexo);
        selectSex.selectByVisibleText("Masculino");

        final var searchInput =
                driver.findElement(By.cssSelector("ul.select2-selection__rendered input.select2-search__field"));
        searchInput.sendKeys("Fotógrafo");
        searchInput.sendKeys(Keys.ENTER);

        actions.moveToElement(guardar).click().perform();

        sleep(5000);


    }

    @Test
    public void agregarUsariostest() {
        rellenarFormularioLogin("115554360", "Concordia2025!");

        final var administracion =
                driver.findElement(By.cssSelector("a.nav-link[title='Administración']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(administracion).click().perform();

        final var administrarUsuarios =
                driver.findElement(By.linkText("Administrar Usuarios"));
        administrarUsuarios.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        final var agregarBtn =
                driver.findElement(By.xpath("//a[contains(text(),'Agregar')]"));
        actions.moveToElement(agregarBtn).perform();
        js.executeScript("arguments[0].click();", agregarBtn);

        //acá se borra el cargo que trae precargado modal de creación
        /*final var removeBtn =
                driver.findElement(By.cssSelector("span.select2-selection__choice__remove"));
        removeBtn.click();

         */

        final var rutInput = driver.findElement(By.id("userid"));
        final var nombres = driver.findElement(By.id("name"));
        final var apellidoPaterno = driver.findElement(By.id("lastn"));
        final var apellidoMaterno = driver.findElement(By.id("lastnm"));
        final var fechaNacimiento = driver.findElement(By.id("birthday"));
        final var telefonoMovil = driver.findElement(By.id("cellphone"));
        final var correoElectronico = driver.findElement(By.id("email"));
        final var direccion = driver.findElement(By.id("address"));
        final var nacionalidad = driver.findElement(By.id("nationality"));
        final var guardar = driver.findElement(By.id("add"));
        final var cargo = driver.findElement(By.id("position"));
        final var horas = driver.findElement(By.id("hours"));


        rutInput.sendKeys("115554360");
        nombres.sendKeys("ROBERTO CARLOS");
        apellidoPaterno.sendKeys("PANTOJA");
        apellidoMaterno.sendKeys("MUÑOZ");
        fechaNacimiento.clear();
        fechaNacimiento.sendKeys("1991-12-15");
        telefonoMovil.sendKeys("936110704");
        correoElectronico.sendKeys("cpantoja@concordia.cl");
        direccion.sendKeys("totoralillo");
        nacionalidad.sendKeys("chileno");
        cargo.sendKeys("Analista");
        horas.sendKeys("20");

        final var campoDropdown = driver.findElement(By.id("select2-state-container"));
        campoDropdown.click();

        final var opcionCoquimbo =
                driver.findElement(By.xpath(
                        "//li[contains(@class, 'select2-results__option') and text()='Coquimbo']"));
        opcionCoquimbo.click();

        final var estadoCivil = driver.findElement(By.id("civil_status"));
        Select selectCivil = new Select(estadoCivil);
        selectCivil.selectByVisibleText("Soltero(a)");

        final var selectSexo = driver.findElement(By.id("sex"));
        Select selectSex = new Select(selectSexo);
        selectSex.selectByVisibleText("Masculino");

        //acá se elile el perfil que se desea agregar
        /*final var searchInput =
                driver.findElement(By.cssSelector("ul.select2-selection__rendered input.select2-search__field"));
        searchInput.sendKeys("Fotógrafo");
        searchInput.sendKeys(Keys.ENTER);

         */

        actions.moveToElement(guardar).click().perform();

        sleep(5000);

    }

    @Test
    public void registrarsetest() {
        final var terrenoURL = "https://qa-terreno.tarjetaestudiante.com/";

        Logs.info("Ingresado a portal de terreno");
        driver.get(terrenoURL);

        final var registrarse =
                driver.findElement(By.linkText("Registrarse"));

        Actions actions = new Actions(driver);
        actions.moveToElement(registrarse).click().perform();

        final var rutInput = driver.findElement(By.id("userid"));
        final var passwordInput = driver.findElement(By.id("newpassword"));
        final var nombres = driver.findElement(By.id("name"));
        final var apellidoPaterno = driver.findElement(By.id("lastn"));
        final var apellidoMaterno = driver.findElement(By.id("lastnm"));
        final var fechaNacimiento = driver.findElement(By.id("birthday"));
        final var telefonoMovil = driver.findElement(By.id("cellphone"));
        final var correoElectronico = driver.findElement(By.id("email"));
        final var passwordAgain = driver.findElement(By.id("password_rp"));
        final var direccion = driver.findElement(By.id("address"));
        final var nacionalidad = driver.findElement(By.id("nationality"));
        final var guardar = driver.findElement(By.id("add"));


        rutInput.sendKeys("153304491");
        passwordInput.sendKeys("Concordia2025!");
        nombres.sendKeys("ROBERTO CARLOS");
        apellidoPaterno.sendKeys("PANTOJA");
        apellidoMaterno.sendKeys("MUÑOZ");
        fechaNacimiento.clear();
        fechaNacimiento.sendKeys("1991-12-15");
        telefonoMovil.sendKeys("936110704");
        correoElectronico.sendKeys("cpantoja@concordia.cl");
        passwordAgain.sendKeys("Concordia2025!");
        direccion.sendKeys("totoralillo");
        nacionalidad.sendKeys("chileno");

        final var campoDropdown = driver.findElement(By.id("select2-state-container"));
        campoDropdown.click();

        final var opcionCoquimbo =
                driver.findElement(By.xpath(
                        "//li[contains(@class, 'select2-results__option') and text()='Coquimbo']"));
        opcionCoquimbo.click();

        final var estadoCivil = driver.findElement(By.id("civil_status"));
        Select selectCivil = new Select(estadoCivil);
        selectCivil.selectByVisibleText("Soltero(a)");

        final var selectSexo = driver.findElement(By.id("sex"));
        Select selectSex = new Select(selectSexo);
        selectSex.selectByVisibleText("Masculino");


        actions.moveToElement(guardar).click().perform();

        sleep(5000);


    }

    @Test
    public void resgistrarseDevtest() {
        final var terrenoURL = "https://dev-terreno.tarjetaestudiante.com/";

        Logs.info("Ingresado a portal de terreno");
        driver.get(terrenoURL);

        final var registrarse =
                driver.findElement(By.linkText("Registrarse"));

        Actions actions = new Actions(driver);
        actions.moveToElement(registrarse).click().perform();

        final var rutInput = driver.findElement(By.id("userid"));
        final var passwordInput = driver.findElement(By.id("newpassword"));
        final var nombres = driver.findElement(By.id("name"));
        final var apellidoPaterno = driver.findElement(By.id("lastn"));
        final var apellidoMaterno = driver.findElement(By.id("lastnm"));
        final var fechaNacimiento = driver.findElement(By.id("birthday"));
        final var telefonoMovil = driver.findElement(By.id("cellphone"));
        final var correoElectronico = driver.findElement(By.id("email"));
        final var passwordAgain = driver.findElement(By.id("password_rp"));
        final var direccion = driver.findElement(By.id("address"));
        final var nacionalidad = driver.findElement(By.id("nationality"));
        final var guardar = driver.findElement(By.id("add"));


        rutInput.sendKeys("169257361");
        passwordInput.sendKeys("123");
        nombres.sendKeys("ROBERTO CARLOS");
        apellidoPaterno.sendKeys("PANTOJA");
        apellidoMaterno.sendKeys("MUÑOZ");
        fechaNacimiento.clear();
        fechaNacimiento.sendKeys("1991-12-15");
        telefonoMovil.sendKeys("936110704");
        correoElectronico.sendKeys("cpantoja@concordia.cl");
        passwordAgain.sendKeys("123");
        direccion.sendKeys("totoralillo");
        nacionalidad.sendKeys("chileno");

        final var campoDropdown = driver.findElement(By.id("select2-state-container"));
        campoDropdown.click();

        final var opcionCoquimbo =
                driver.findElement(By.xpath(
                        "//li[contains(@class, 'select2-results__option') and text()='Coquimbo']"));
        opcionCoquimbo.click();

        final var estadoCivil = driver.findElement(By.id("civil_status"));
        Select selectCivil = new Select(estadoCivil);
        selectCivil.selectByVisibleText("Soltero(a)");

        final var selectSexo = driver.findElement(By.id("sex"));
        Select selectSex = new Select(selectSexo);
        selectSex.selectByVisibleText("Masculino");


        actions.moveToElement(guardar).click().perform();

        sleep(5000);


    }

    @Test
    public void registrarNOKtest() {
        //se crea usuario con password sin caracter especiales -> no permite crear usuario dado que password no cumple
        final var terrenoURL = "https://qa-terreno.tarjetaestudiante.com/";

        Logs.info("Ingresado a portal de terreno");
        driver.get(terrenoURL);

        final var registrarse =
                driver.findElement(By.linkText("Registrarse"));

        Actions actions = new Actions(driver);
        actions.moveToElement(registrarse).click().perform();

        final var rutInput = driver.findElement(By.id("userid"));
        final var passwordInput = driver.findElement(By.id("newpassword"));
        final var nombres = driver.findElement(By.id("name"));
        final var apellidoPaterno = driver.findElement(By.id("lastn"));
        final var apellidoMaterno = driver.findElement(By.id("lastnm"));
        final var fechaNacimiento = driver.findElement(By.id("birthday"));
        final var telefonoMovil = driver.findElement(By.id("cellphone"));
        final var correoElectronico = driver.findElement(By.id("email"));
        final var passwordAgain = driver.findElement(By.id("password_rp"));
        final var direccion = driver.findElement(By.id("address"));
        final var nacionalidad = driver.findElement(By.id("nationality"));
        final var guardar = driver.findElement(By.id("add"));


        rutInput.sendKeys("134629002");
        passwordInput.sendKeys("123");
        nombres.sendKeys("ROBERTO CARLOS");
        apellidoPaterno.sendKeys("PANTOJA");
        apellidoMaterno.sendKeys("MUÑOZ");
        fechaNacimiento.clear();
        fechaNacimiento.sendKeys("1991-12-15");
        telefonoMovil.sendKeys("936110704");
        correoElectronico.sendKeys("cpantoja@concordia.cl");
        passwordAgain.sendKeys("123");
        direccion.sendKeys("totoralillo");
        nacionalidad.sendKeys("chileno");

        final var campoDropdown = driver.findElement(By.id("select2-state-container"));
        campoDropdown.click();

        final var opcionCoquimbo =
                driver.findElement(By.xpath(
                        "//li[contains(@class, 'select2-results__option') and text()='Coquimbo']"));
        opcionCoquimbo.click();

        final var estadoCivil = driver.findElement(By.id("civil_status"));
        Select selectCivil = new Select(estadoCivil);
        selectCivil.selectByVisibleText("Soltero(a)");

        final var selectSexo = driver.findElement(By.id("sex"));
        Select selectSex = new Select(selectSexo);
        selectSex.selectByVisibleText("Masculino");


        actions.moveToElement(guardar).click().perform();

        sleep(5000);


    }

    private void rellenarFormularioLogin(String username, String password) {

        final var terrenoURL = "https://qa-terreno.tarjetaestudiante.com/";

        Logs.info("Ingresado a portal de terreno");
        driver.get(terrenoURL);

        sleep(2000);

        final var rutInput = driver.findElement(By.id("userid"));
        final var passwordInput = driver.findElement(By.id("pass"));
        final var loginButton = driver.findElement(By.cssSelector("button.btn.btn-primary"));

        rutInput.sendKeys(username);
        passwordInput.sendKeys(password);

        Actions actions = new Actions(driver);
        actions.moveToElement(loginButton).click().perform();

        sleep(1000);

        /*final var hamburguesaMenus =
                driver.findElement(By.cssSelector("button.button-menu-mobile"));

        hamburguesaMenus.click();

         */


    }

}
