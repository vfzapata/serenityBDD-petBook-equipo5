package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetBookGatoResultadosPage {

	public static final Target LISTA_GATOS_FILTRADO = Target.the("Lista de gatos filtrados").located(By.xpath("/html/body/app-root/div/app-imagegallery/div/div[3]/ul/li"));

}
