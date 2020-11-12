package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetBookPerroResultadosPage {

	public static final Target LISTA_PERROS_FILTRADO = Target.the("Lista de perros filtrados").located(By.xpath("/html/body/app-root/div/app-imagegallery/div/div[3]/ul/li"));

}
