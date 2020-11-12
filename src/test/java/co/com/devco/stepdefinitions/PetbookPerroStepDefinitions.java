package co.com.devco.stepdefinitions;

import co.com.devco.tasks.FiltrarPerro;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.userinterfaces.PetBookPerroResultadosPage.LISTA_PERROS_FILTRADO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class PetbookPerroStepDefinitions {

    @Cuando("^(.*) filtra por perros en las imagenes de pet-book$")
    public void filtrarPerros(String actorName) {
        theActorCalled(actorName).attemptsTo(
                FiltrarPerro.Busqueda()
        );
    }

    @Entonces("^debe ver tres animales de perros en las imagenes$")
    public void verPerrosFiltrados() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LISTA_PERROS_FILTRADO).values().hasSize(3)
        );
    }
}
