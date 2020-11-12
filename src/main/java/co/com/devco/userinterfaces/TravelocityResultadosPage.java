package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TravelocityResultadosPage {
	public static final Target LISTA_VUELOS_BUSCADOS = Target.the("Lista de vuelos buscados").located(By.xpath("//ul[@id='flightModuleList']/li"));

}
