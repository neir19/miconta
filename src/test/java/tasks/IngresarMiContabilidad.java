package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.HomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarMiContabilidad implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.LABEL_MICONTABILIDAD)
        );

    }
    public static IngresarMiContabilidad ingresar(){
        return instrumented(IngresarMiContabilidad.class);

    }
}
