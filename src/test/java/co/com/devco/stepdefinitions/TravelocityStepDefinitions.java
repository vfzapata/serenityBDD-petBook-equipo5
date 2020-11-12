package co.com.devco.stepdefinitions;

import co.com.devco.tasks.BuscarVuelos;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.userinterfaces.TravelocityResultadosPage.LISTA_VUELOS_BUSCADOS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class TravelocityStepDefinitions {

    @Cuando("^(.*) busca un vuelo de \"(.*)\" a \"(.*)\" para las fechas \"(.*)\" - \"(.*)\"")
    public void buscarVuelo(String actorName, String ciudadOrigen, String ciudadDestino, String fechaSalida, String fechaRegreso) {
        theActorCalled(actorName).attemptsTo(
            BuscarVuelos.con(ciudadOrigen, ciudadDestino, fechaSalida, fechaRegreso)
        );
    }

    @Entonces("^debe ver por lo menos un vuelo dispoble$")
    public void verVuelosDisponibles() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LISTA_VUELOS_BUSCADOS).values().hasSizeGreaterThan(1)
        );
    }
}
