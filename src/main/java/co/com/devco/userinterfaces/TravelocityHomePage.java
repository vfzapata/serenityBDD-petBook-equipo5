package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TravelocityHomePage {
	public static final String TRAVELOCITY_HOME_PAGE = "https://www.travelocity.com/";

	public static final Target PESTANA_VUELOS = Target.the("Pestaña vuelos").located(By.xpath("//button[@id='tab-flight-tab-hp']"));

	public static final Target INPUT_CIUDAD_ORIGEN = Target.the("Campo de ciudad origen").located(By.xpath("//input[@id='flight-origin-hp-flight']"));
	public static final Target INPUT_CIUDAD_DESTINO = Target.the("Campo de ciudad destino").located(By.xpath("//input[@id='flight-destination-hp-flight']"));
	public static final Target INPUT_FECHA_SALIDA = Target.the("Campo fecha de salida").located(By.xpath("//input[@id='flight-departing-hp-flight']"));
	public static final Target INPUT_FECHA_REGRESO = Target.the("Campo fecha de regreso").located(By.xpath("//input[@id='flight-returning-hp-flight']"));
	public static final Target BOTON_BUSCAR_VUELO = Target.the("Boton buscar vuelos").located(By.xpath("//input[@title='Buscar']"));
}
