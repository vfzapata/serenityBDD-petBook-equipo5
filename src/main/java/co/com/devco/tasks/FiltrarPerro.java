package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.PetbookPerroHomePage.BOTON_FILTRAR_PERRO;
import static co.com.devco.userinterfaces.PetbookPerroHomePage.PETBOOK_HOME_PAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FiltrarPerro implements Task {


    public FiltrarPerro() {

    }

    public static Performable Busqueda() {
        return instrumented(FiltrarPerro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Open.url(PETBOOK_HOME_PAGE),

                Click.on(BOTON_FILTRAR_PERRO)
        );
    }
}
