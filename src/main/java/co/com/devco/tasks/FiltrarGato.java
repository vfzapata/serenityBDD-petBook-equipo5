package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.devco.userinterfaces.PetbookGatoHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FiltrarGato implements Task {


    public FiltrarGato() {

    }

    public static Performable Busqueda() {
        return instrumented(FiltrarGato.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Open.url(PETBOOK_HOME_PAGE),

                Click.on(BOTON_FILTRAR_GATO)
        );
    }
}
