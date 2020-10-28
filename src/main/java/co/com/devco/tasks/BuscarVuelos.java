package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.devco.userinterfaces.GoogleResultadosPage.RESULTADOS_BUSQUEDA;
import static co.com.devco.userinterfaces.GoogleSearchPage.CAMPO_BUSQUEDA;
import static co.com.devco.userinterfaces.GoogleSearchPage.GOOGLE_HOME_PAGE;
import static co.com.devco.userinterfaces.TravelocityHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarVuelos implements Task {
    private String ciudadOrigen;
    private String ciudadDestino;
    private String fechaSalida;
    private String fechaRegreso;


    public BuscarVuelos(String ciudadOrigen, String ciudadDestino, String fechaSalida, String fechaRegreso) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
    }

    public static Performable con(String ciudadOrigen, String ciudadDestino, String fechaSalida, String fechaRegreso) {
        return instrumented(BuscarVuelos.class, ciudadOrigen, ciudadDestino, fechaSalida, fechaRegreso);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(TRAVELOCITY_HOME_PAGE),

                Click.on(PESTANA_VUELOS),

                Click.on(INPUT_CIUDAD_ORIGEN),
                Enter.theValue(ciudadOrigen).into(INPUT_CIUDAD_ORIGEN),
                Hit.the(Keys.ENTER).into(INPUT_CIUDAD_ORIGEN),

                Click.on(INPUT_CIUDAD_DESTINO),
                Enter.theValue(ciudadDestino).into(INPUT_CIUDAD_DESTINO),
                Hit.the(Keys.ENTER).into(INPUT_CIUDAD_DESTINO),

                Click.on(INPUT_FECHA_SALIDA),
                Enter.theValue(fechaSalida).into(INPUT_FECHA_SALIDA),

                Click.on(INPUT_FECHA_REGRESO),
                Clear.field(INPUT_FECHA_REGRESO),
                Enter.theValue(fechaRegreso).into(INPUT_FECHA_REGRESO),

                Click.on(BOTON_BUSCAR_VUELO)
        );
    }
}
