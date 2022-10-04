package steps;

import Questions.CaptureText;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import models.DataLogin;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Shared;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tasks.IngresarMiContabilidad;
import tasks.Login;
import tasks.PaginaOpen;
import userInterface.HomePage;
import userInterface.MiContabilidadPage;
import utils.Words;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;



public class LoginStep  {

    @Shared
    DataLogin dataLogin;
    Actor actor;
    @Managed(driver = "chrome")
    WebDriver driver;

    public LoginStep(){

    }
        @Dado("El usuario abra la pagina")
        public  void iniciar_navegador(){
            actor=  Actor.named("juan");
            actor.can(BrowseTheWeb.with(driver));
            driver.manage().window().maximize();
            actor.has(PaginaOpen.abrir());
        }


    @Cuando("el usuario ingrese sus datos")
    public void el_usuario_ingrese_sus_datos(){
        BrowseTheWeb.as(actor).waitFor(5).seconds();
        actor.attemptsTo(Login.user(dataLogin.getUSER_NAME(),dataLogin.getPASSWORD()));
        actor.should(seeThat((CaptureText.is(HomePage.LABEL_TITULO) ), equalTo(Words.TITLE_HOME)));
        actor.attemptsTo(IngresarMiContabilidad.ingresar());
    }
    @Entonces("deberia ver el subitulo")
    public void el_usuario_podrá_ver_la_interfaz(){
        BrowseTheWeb.as(actor).waitFor(5).seconds();
        actor.should(seeThat((CaptureText.is(MiContabilidadPage.TITLE_MICONTABILIDAD) ), equalTo(Words.TITLE_CONTABILIDAD)));





        }

}
