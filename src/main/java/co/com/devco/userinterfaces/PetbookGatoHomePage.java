package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetbookGatoHomePage {

	public static final String PETBOOK_HOME_PAGE = "http://localhost:4200/";

	public static final Target BOTON_FILTRAR_GATO = Target.the("Boton filtrar gatos").located(By.xpath("/html/body/app-root/div/app-imagegallery/div/div[2]/div[4]/button"));


}
