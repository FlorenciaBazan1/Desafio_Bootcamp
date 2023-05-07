package aut.testcreation.testcases;

import aut.testcreation.pages.ReservaPage;
import aut.testcreation.pages.ResultadosPage;
import aut.testcreation.pages.RumboHomePageVuelos;
import framework.engine.selenium.SeleniumTestBase;
import framework.engine.selenium.DriverFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class TestVuelosRumbo extends SeleniumTestBase {
    WebDriver driver;

    RumboHomePageVuelos rumboHomePageVuelos;
    ReservaPage reservaPage;

    ResultadosPage resultadosPage;

    @Test
    public void CP0007_DatosVueloDebeElegirDestino() {
    rumboHomePageVuelos= new RumboHomePageVuelos(super.driver);
    rumboHomePageVuelos.navigateTo("https://www.rumbo.es/");
    rumboHomePageVuelos.rechazarCookies();
    rumboHomePageVuelos.ingresarOrigen("Buenos Aires (BUE)");
    rumboHomePageVuelos.borrarInputDestino();
    rumboHomePageVuelos.ingresarFecha();
    rumboHomePageVuelos.buscarVuelo();
    Assertions.assertEquals("Introduce ciudad o aeropuerto de destino", rumboHomePageVuelos.mensajeErrorIngreseDestino());




    }

    @Test
    public void CP0008_DatosVueloAniadirHotel(){
    rumboHomePageVuelos= new RumboHomePageVuelos(super.driver);
        rumboHomePageVuelos.navigateTo("https://www.rumbo.es/");
        rumboHomePageVuelos.rechazarCookies();
        rumboHomePageVuelos.ingresarOrigen("Buenos Aires (BUE)");
        rumboHomePageVuelos.ingresarDestino("Santiago (SCL)");
        rumboHomePageVuelos.ingresarFecha();

        rumboHomePageVuelos.buscarVuelo();

    }

    @Test
    public void CP0011_DatosReservaFaltaIngresarMedioDePago() {
    rumboHomePageVuelos= new RumboHomePageVuelos(super.driver);
    rumboHomePageVuelos.navigateTo("https://www.rumbo.es/");

    }


    @Issue("123")
    @Issue("432")
    @DisplayName("Human-readable test name")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test creado para bootcamp 9 tsoft")
    public void testDemo() throws InterruptedException {
        driver = DriverFactory.getDriver();
        driver.navigate().to(BASE_URL_AUT);
        Thread.sleep(5000);
        Assertions.assertTrue(true);
    }
}