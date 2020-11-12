package co.com.devco.stepdefinitions;

import co.com.devco.tasks.FiltrarGato;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.userinterfaces.PetBookGatoResultadosPage.LISTA_GATOS_FILTRADO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class PetbookGatoStepDefinitions {

    @Cuando("^(.*) filtra por gatos en las imagenes de pet-book$")
    public void filtrarGatos(String actorName) {
        theActorCalled(actorName).attemptsTo(
                FiltrarGato.Busqueda()
        );
    }

    @Entonces("^debe ver dos animales de gatos en las imagenes$")
    public void verGatosFiltrados() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LISTA_GATOS_FILTRADO).values().hasSize(2)
        );
    }
}
