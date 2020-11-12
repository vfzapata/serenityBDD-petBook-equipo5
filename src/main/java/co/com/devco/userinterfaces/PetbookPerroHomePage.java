package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetbookPerroHomePage {

	public static final String PETBOOK_HOME_PAGE = "http://localhost:4200/";

	public static final Target BOTON_FILTRAR_PERRO = Target.the("Boton filtrar perros").located(By.xpath("/html/body/app-root/div/app-imagegallery/div/div[2]/div[3]/button"));


}
